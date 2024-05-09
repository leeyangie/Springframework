package com.spring11.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring11.dto.Store;
import com.spring11.vo.InjectionJava1;

public class InjectionJavaTest1 {
	
	private InjectionJava1 injectionJava1; //필드 주입
	
	@Autowired
	public InjectionJavaTest1(InjectionJava1 injectionJava1) {
		this.injectionJava1 = injectionJava1;
	}
	
	//수정자(setter) 주입
	@Autowired
	public void setInjectionJava1(InjectionJava1 injectionJava1) {
		this.injectionJava1 = injectionJava1;
	}

	public Store getStore() {
		return injectionJava1.getStore();
	}	
}


