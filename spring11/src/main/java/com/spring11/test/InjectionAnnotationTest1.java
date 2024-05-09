package com.spring11.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring11.dto.Market;
import com.spring11.dto.Shop;
import com.spring11.dto.Store;

public class InjectionAnnotationTest1 {

	@Autowired
	private InjectionAnnotation1 obj1;
	
	@Autowired
	private InjectionAnnotation2 obj2;
	
	@Autowired
	private InjectionAnnotation3 obj3;
	
	@Autowired
	private InjectionAnnotation4 obj4;

	
	public Store getStore() {
		return obj1.getStoreBean1();
	}

	public Shop getShop() {
		return obj2.getShopBean1();
	}
	
	public Market getMarket() {
		return obj3.getMarketBean1();
	}
	
	public int getData1() {
		return obj4.getData1();
	}


	
}