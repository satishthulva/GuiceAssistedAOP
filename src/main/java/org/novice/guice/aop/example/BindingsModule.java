package org.novice.guice.aop.example;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.matcher.Matchers;

public class BindingsModule extends AbstractModule {

	@Override
	protected void configure() {
		
		CustomMethodInterceptor interceptor = new CustomMethodInterceptor();
		
		bindInterceptor(Matchers.subclassesOf(TargetClass.class), Matchers.annotatedWith(InterceptMethod.class), interceptor);
		
		install(new FactoryModuleBuilder()
	     .build(TargetClassBuilderFactory.class));
	}

}
