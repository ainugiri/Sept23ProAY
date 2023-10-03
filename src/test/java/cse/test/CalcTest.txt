package cse.test;
import cse.com.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test1() {
		assertEquals(15,Calculator.addition(10, 5));
	}
	@Test
	void test2() {
		assertEquals(2,Calculator.division(10, 5));
	}
	@Test
	void test3() {
		assertEquals(50,Calculator.multiplication(10, 5));
	}
	@Test
	void test4() {
		assertEquals(5,Calculator.subtraction(10, 5));
	}

}
