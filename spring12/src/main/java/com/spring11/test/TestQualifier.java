package com.spring11.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring11.dao.SampleDAO;
import com.spring11.dao.SampleDAOImpl;

public class TestQualifier {

	@Autowired
	@Qualifier
	
	private SampleDAO sampleDAO;
	
	/*
	 * 아이디와 클래스 이름이 다를경우
	 * @Autowired
	 * @Qualifier(sqlSession)
	 * 
	 * private SampleDAO sqlSession;
	 */
	public TestQualifier() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
