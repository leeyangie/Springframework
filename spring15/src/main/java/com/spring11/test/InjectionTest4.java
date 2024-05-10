package com.spring11.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring11.dto.Mart;

public class InjectionTest4 {

	public static void main(String[] args) {
		ApplicationContext ctx4 = new GenericXmlApplicationContext("classpath:injectionContext4.xml");
		
		Mart mart1 = ctx4.getBean("mart1", Mart.class);
		System.out.println(mart1);
		
//		ctx4.getBean("mart1", Mart.class) 코드는 스프링 컨테이너에서 "mart1"이라는 이름의 빈을 가져오는데, 
//		이때 반환되는 객체의 타입은 Mart 클래스로 지정됩니다.
	}

}
