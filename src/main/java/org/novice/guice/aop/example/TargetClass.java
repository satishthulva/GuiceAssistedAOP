package org.novice.guice.aop.example;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class TargetClass {

	private String fieldOne;
	
	private String fieldTwo;
	
	@AssistedInject
	public TargetClass(@Assisted("one") String one, @Assisted("two") String two) {
		this.fieldOne = one;
		this.fieldTwo = two;
	}
	
	@AssistedInject
	public TargetClass(@Assisted("one") String one) {
		this.fieldOne = one;
		this.fieldTwo = "two dummy";
	}
	
	@AssistedInject
	public TargetClass(@Assisted("arr") String ... pars)
	{
		if(pars != null && pars.length > 0)
		{
			this.fieldOne = pars[0];
			if(pars.length > 1)
				this.fieldTwo = pars[1];
		}
	}
	
	/**
	 * @return the fieldOne
	 */
	public String getFieldOne() {
		return fieldOne;
	}


	/**
	 * @return the fieldTwo
	 */
	public String getFieldTwo() {
		return fieldTwo;
	}


	@InterceptMethod
	public void methodToIntercept() {
		System.out.println("This is the method TO intercept");
	}
	
	public void methodNotToIntercept() {
		System.out.println("This is the method not to intercept");
	}
}
