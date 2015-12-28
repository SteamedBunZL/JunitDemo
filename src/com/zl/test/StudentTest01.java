package com.zl.test;

import com.zl.bean.Student;

import junit.framework.TestCase;

public class StudentTest01 extends TestCase{
	
	Student testStudent;
	
	/**
	 * 此方法在执行每一个测试方法之前(测试用例)之前调用 
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		testStudent = new Student("djm", "boy", 178, 24, "华东政法");
		System.out.println("setUp()");
	}
	
	/**
	 * 此方法在执行每一个测试方法之后调用
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("tearDown()");
	}
	
	/**
	 * 测试用例，测试Person对象的getSex()方法
	 */
	public void testGetSex(){
		assertEquals("boy", testStudent.getSex());
		System.out.println("testGetSex()");
	}
	
	/**
	 * 测试Person对象的getAge()方法
	 */
	public void testGetAge(){
		assertEquals(24, testStudent.getAge());
		System.out.println("testGetAge()");
	}
	
	

}
