package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.PalindromeNumber;

class PalindromeNumberTest {
	PalindromeNumber obj = new PalindromeNumber();
	@Test
	void test() {
		int a = 121;
		assertTrue(obj.solution(a));
	}
	
	@Test
	void test1() {
		int a = -123;
		assertFalse(obj.solution(a));
	}
	
	@Test
	void test2() {
		int a = 10;
		assertFalse(obj.solution(a));
	}
	
	@Test
	void test3() {
		int a = 0;
		assertTrue(obj.solution(a));
	}

}
