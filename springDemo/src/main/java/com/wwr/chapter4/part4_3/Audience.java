package com.wwr.chapter4.part4_3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
    @Pointcut("execution(* com.wwr.chapter4.part4_3..perform(..))")
    public void pointCut(){}

    @Around("pointCut()")
    public void watchPerform(ProceedingJoinPoint jp){
        try{
            System.out.println("Sliencing call phones");
            System.out.println("Taking seats");
//            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        }catch (Throwable throwable) {
            System.out.println("Demanding arefund");
            throwable.printStackTrace();
        }
    }

}
