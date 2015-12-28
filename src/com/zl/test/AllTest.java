package com.zl.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 如果同时需要一起测试以上这两个测试类，可以通过TestSuite类实现，它相当于是一个套件，可以把所有测试类添进来一起运行测试
 * @author ZL
 *
 */
public class AllTest {	
	public static Test suite(){
		TestSuite suite = new TestSuite("Test for com.zl.test");
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(StudentTest01.class);
		return suite;
	}
}
