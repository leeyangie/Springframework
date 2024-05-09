package com.spring11.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring11.dao.SampleDAO;
import com.spring11.dao.SampleDAOImpl;

public class TestAutowired {

	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
