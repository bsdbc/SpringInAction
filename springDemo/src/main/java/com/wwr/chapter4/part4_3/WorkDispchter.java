package com.wwr.chapter4.part4_3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WorkDispchter {
    @DeclareParents(value = "com.wwr.chapter4.part4_3.MiddleStudent",defaultImpl = CleanClassroom.class)
    public Work work;

}
