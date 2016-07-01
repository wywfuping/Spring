package com.yawei.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import javax.inject.Named;

@Named
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.yawei.dao..*.*(..))")
    public void pointCut(){}

    //前置通知
    @Before("pointCut()")
    public void beforeAdvice() {
        System.out.println("前置通知~~~");
    }

    //后置通知
    @AfterReturning(pointcut = "pointCut()")
    public void afAdvice() {
        System.out.println("后置通知~~~");
    }

    public void afAdvice(Object result) {
        System.out.println("后置通知~~~" + result);
    }

    //异常通知
    @AfterThrowing(pointcut = "pointCut()",throwing = "e")
    public void exceptionAdvice(Exception e) {
        System.out.println("异常通知~~~" + e);
    }

    //最终通知
    @After("pointCut()")
    public void finalAdvice() {
        System.out.println("最终通知~~~");
    }


    @Around("pointCut()")
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
