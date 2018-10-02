package org.novice.guice.aop.example;

import com.google.inject.assistedinject.Assisted;

public interface TargetClassBuilderFactory {

	public TargetClass createTargetClass(@Assisted("one") String fieldOne, @Assisted("two") String fieldTwo);

	public TargetClass createAnotherTargetClass(@Assisted("one") String fieldOne);

	public TargetClass createVarArgsTC(@Assisted("arr") String ...strings);
	
}
