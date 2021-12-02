package com.durvisha.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginUserDetailAspect {

    @Before(value = "execution(* com.durvisha.service.LoginUserDetailService.*(..)) and args(username,userId)")
    public void beforeAdvice(JoinPoint joinPoint, String username, Integer userId) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating User with name - " + username + " and id - " + userId);
    }

    @After(value = "execution(* com.durvisha.service.LoginUserDetailService.*(..)) and args(username,userId)")
    public void afterAdvice(JoinPoint joinPoint, String username, Integer userId) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created User with name - " + username + " and id - " + userId);
    }

}
