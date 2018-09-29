package com.aoptest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by michael on 17-5-10.
 * 基于注解配置aop
 */
@Component
@Aspect//定义切面标识
public class AnnotationAOP {

    public AnnotationAOP() {
        System.out.println("AnnotationAOP init----------");
    }

    //代理com.michael.controller包下的UserController类的所有方法
    @Before("execution(* com.michael.controller.UserController.*(..))")
    public void beforeTest(JoinPoint joinPoint) {
        System.out.println("拦截UserController--------------");
    }

//    //代理com.michael.controller包下的UserController类的所有方法
//    @Before("execution(* com.michael.service.UserService.*(..))")
//    public void beforeTest(JoinPoint joinPoint) {
//        System.out.println("拦截UserService--------------");
//    }
}
