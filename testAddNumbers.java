package jUnitTestngPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit=new jUnitFunctions();
		int result=junit.addnum(20, 100);
		assertEquals(120, result);
	}
	@Test
	public void test2() {
		jUnitFunctions junit=new jUnitFunctions();
		int result=junit.addnum(20, 100);
		assertEquals(10, result);
	}

}
