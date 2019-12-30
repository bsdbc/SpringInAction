package com.wwr.chapter4.part4_3;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class TrackCounter {

    private Map<Integer ,Integer> trackCounters=new HashMap<Integer,Integer>();

    @Pointcut("execution(* com.wwr.chapter4.part4_3..playTrack(int)) && args(trackNumber)")
    public void pointCut(int trackNumber){}

    @Before("pointCut(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount=getPlayCount(trackNumber);
        trackCounters.put(trackNumber,currentCount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounters.containsKey(trackNumber)?trackCounters.get(trackNumber):0;
    }
}
