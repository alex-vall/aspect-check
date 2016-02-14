package com.vall.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * Created by Vall on 14.02.2016.
 */

@Aspect
@Component
public class ActionPerformerAspect {

    @Pointcut("execution(* com.vall.logic.ActionPerformer.performAction(int)) && args(param)")
    public void performAction(int param) {}

    @Before("performAction(param)")
    public void beforePerformAction(int param) {
        System.out.println("beforePerformAction: " + param);
    }

}
