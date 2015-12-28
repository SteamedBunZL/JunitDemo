package com.zl.test;

import com.zl.bean.Student;

import junit.framework.TestCase;

public class StudentTest extends TestCase{
	
	private Student testStudnet;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		testStudnet = new Student("steve_u", "boy", 170, 23, "上海理工");
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetage(){
		assertTrue(testStudnet.setAge(21));
	}
	
	public void testGetSchool(){
		assertEquals("南昌大学", testStudnet.getSchool());
	}
	
	public void testGetName(){
		assertEquals("hdy", testStudnet.getName());
	}

}
