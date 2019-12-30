package com.wwr.chapter4.part4_1;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(* com.wwr.chapter4..perform(..))")
    public void pointCut(){}
    @Before("pointCut()")
    public void silenceCallPhones(){
        //表演之前手机静音
        System.out.println("Silencing call phones");
    }
    @Before("pointCut()")
    public void takeSeats(){
        //表演之前落座
        System.out.println("Taking seats");
    }
    @AfterReturning("pointCut()")
    public void applause(){
        //表演成功之后鼓掌
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("pointCut()")
    public void demandRefund(){
        //表演失败之后请求退款
        System.out.println("Demanding a refund");
    }
}
