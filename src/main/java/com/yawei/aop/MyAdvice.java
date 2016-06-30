package com.yawei.aop;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

    //前置通知
    public void beforeAdvice() {
        System.out.println("前置通知~~~");
    }

    //前置通知
    public void afAdvice() {
        System.out.println("后置通知~~~");
    }

    public void afAdvice(Object result) {
        System.out.println("后置通知~~~" + result);
    }

    //异常通知
    public void exceptionAdvice(Exception e) {
        System.out.println("异常通知~~~" + e);
    }

    //最终通知
    public void finalAdvice() {
        System.out.println("最终通知~~~");
    }

    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        Object obj=null;
        try {
            System.out.println("前置通知~~~~~~");
            obj = joinPoint.proceed();
            System.out.println("后置通知~~~~~~");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知~~~~~~"+throwable);
        }finally {
            System.out.println("最终通知~~~~~~");
        }
        return obj;
    }
}
