package com.testing.one;

import org.testng.annotations.Test;

public class Mavendemo {

	@Test

	public void sum() {

		int a, b, c;

		a = 3000;

		b = 589;

		c = a + b;

		System.out.println("The sum of two is " + c);

	}

	@Test

	public void difference() {

		int a, b, c;

		a = 870;

		b = 408;

		c = a - b;

		System.out.println("The difference of two is " + c);

	}

	@Test

	public void mul() {

		int a, b, c;

		a = 1008;

		b = 205;

		c = a * b;

		System.out.println("The mul of two is " + c);

	}

}
