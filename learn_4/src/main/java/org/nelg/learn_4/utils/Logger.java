package org.nelg.learn_4.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//表示当前是一个切面类
@Aspect
public class Logger {

    //配置切面表达式
    @Pointcut("execution(public void org.nelg.learn_4.service.WalletService.getMoney())")
    private void pt1() {
    }

    @Before("pt1()")
    public void printLog() {
        System.out.println("-----print logger-----");
    }

    //@Around("execution(public void org.nelg.learn_4.service.WalletService.getMoney())")
    public Object printAroundLog(ProceedingJoinPoint pjp) {
        Object rtValue = null;

        try {
            //得到方法执行所需要的参数
            Object[] args = pjp.getArgs();

            //手动书写通知
            System.out.println("-----print logger before-----");
            pjp.proceed(args);
            System.out.println("-----print logger after-----");
        } catch (Throwable t) {
            System.out.println("-----print logger error-----");
            throw new RuntimeException(t);
        } finally {
            System.out.println("-----print logger end-----");
        }

        return rtValue;
    }
}
