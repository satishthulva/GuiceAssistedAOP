package org.novice.guice.aop.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomMethodInterceptor implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("Method interceptor called");
		return arg0.proceed();
	}

}
