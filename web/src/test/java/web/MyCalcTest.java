package web;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test1() {
		MyCalc mc=new MyCalc();
		assertEquals(10,mc.add(5,5));
	}
	@Test
	public void test2() {
		MyCalc mc=new MyCalc();
		assertEquals(5,mc.add(2,3));
	}
	@Test
	public void test3() {
		MyCalc mc=new MyCalc();
		assertEquals(10,mc.prod(2,5));
	}

}
