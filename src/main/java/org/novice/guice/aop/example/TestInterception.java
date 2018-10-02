package org.novice.guice.aop.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestInterception {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new BindingsModule());
		
		TargetClassBuilderFactory factory = injector.getInstance(TargetClassBuilderFactory.class);
		TargetClass tc = factory.createTargetClass("one", "two");
		
		System.out.println(tc.getFieldOne());

		tc.methodToIntercept();
		
		tc.methodNotToIntercept();
		
		System.out.println(tc.getFieldTwo());
		
		tc = factory.createAnotherTargetClass("another");
		
		System.out.println(tc.getFieldOne());

		tc.methodToIntercept();
		
		tc.methodNotToIntercept();
		
		System.out.println(tc.getFieldTwo());
		
		tc = factory.createVarArgsTC("something", "else", "tried");
		
		System.out.println(tc.getFieldOne());

		tc.methodToIntercept();
		
		tc.methodNotToIntercept();
		
		System.out.println(tc.getFieldTwo());
	}
	
}
