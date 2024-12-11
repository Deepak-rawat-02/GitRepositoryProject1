package com.nit.GitProj1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void testSumWithPositive() {
		App app = new App();
		int expected = 300;
		int actual = app.sum(100, 200);
		assertEquals(expected, actual);

	}

	@Test
	public void testSumWithNegative() {
		App app = new App();
		int expected = -300;
		int actual = app.sum(-100, -200);
		assertEquals(expected, actual);

	}

	@Test
	public void testSumWithMixedValue() {
		App app = new App();
		int expected = -100;
		int actual = app.sum(100, -200);
		assertEquals(expected, actual);

	}

	@Test
	public void testSumWithZero() {
		App app = new App();
		int expected = 100;
		int actual = app.sum(100, 0);
		assertEquals(expected, actual);

	}
}
