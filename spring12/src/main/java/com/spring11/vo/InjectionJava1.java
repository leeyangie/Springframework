package com.spring11.vo;

import com.spring11.dto.Store;

public class InjectionJava1 {
	
	private Store store;
	
	public InjectionJava1(Store store) {
		super();
		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	

}
