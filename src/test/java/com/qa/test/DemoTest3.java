package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest3 {
	@Test
	public void sum() {
		int a=10;
		int b=20;
		int c=30;
		Assert.assertEquals(30, a+b);
		System.out.println("Add is :" + (a+b));
	}
	@Test
	public void sub() {
		int d=30;
		int e=31;
		Assert.assertEquals(-1, d-e);
		System.out.println("Sub is :" +  (d-e));
	}
	@Test
	public void mul() {
		int d=30;
		int e=31;
		Assert.assertEquals(930, d*e);
		System.out.println("Mul is :" +  (d*e));
	}
	@Test
	public void div() {
		int d=5;
		int e=5;
		Assert.assertEquals(1, 5/5);
		System.out.println("Div is :" +  (d/e));
	}

}
