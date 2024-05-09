package com.spring11.test;

import javax.inject.Inject;

import com.spring11.dao.SampleDAO;
import com.spring11.dao.SampleDAOImpl;

public class TestInject {

	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
