package com.selfcompany.customermanagement.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOG = LogManager.getLogger(LoggingAspect.class);

    @Around("execution(* com.example.*.*.*(..))")
    public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        LOG.info("Method {} with arguments {} returned {} in {} ms", joinPoint.getSignature(), joinPoint.getArgs(), result, elapsedTime);
        return result;
    }
}
