package com.example.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;

import java.util.Arrays;

public class LogBook {
    @AfterThrowing(pointcut = "execution(public * com.example.demo.service.BookService.*(..))", throwing = "e")
    public void logError(JoinPoint joinPoint, Exception e) {
        String className = joinPoint.getClass().getSimpleName();
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("Warning :)): %s.%s.%s.%s: %s", className,
                returnType,
                methodName,
                argsName,
                e.getMessage());
    }

    @After("execution(public * com.example.demo.service.BookService.save(..))" + " || execution(public * com.example.demo.service.BookService.borrow(..))"
            + " || execution(public * com.example.demo.service.BookService.giveBack(..))")
    public void logChange(JoinPoint joinPoint) {
        String className = joinPoint.getClass().getSimpleName();
        String returnType = joinPoint.getSignature().getDeclaringType().getName();
        String methodName = joinPoint.getSignature().getName();
        String argsName = Arrays.toString(joinPoint.getArgs());
        System.err.printf("Warning : %s.%s.%s.%s: %s", className,
                returnType,
                methodName,
                argsName,
                "Number of books has changed !");
    }
}
