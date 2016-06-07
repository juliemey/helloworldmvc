package org.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {
	
	private DAOHelloWorld dao;
	
	@Before
	public void setUp(){
		dao = new DAOHelloWorld();
		
	}

	@Test
	public void test() {
		boolean expected = true;
		assertEquals(expected, this.dao.open());
	}

}
