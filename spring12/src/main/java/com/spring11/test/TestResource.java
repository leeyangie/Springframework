package com.spring11.test;

import javax.annotation.Resource;

import com.spring11.dao.SampleDAO;
import com.spring11.dao.SampleDAOImpl;

public class TestResource {
	
	@Resource(name="testDAO")
	private SampleDAO sampleDAO;
	
	public TestResource() {
		this.sampleDAO = new SampleDAOImpl();
	}

}
