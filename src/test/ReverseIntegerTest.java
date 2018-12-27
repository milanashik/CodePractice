package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ReverseInteger;

class ReverseIntegerTest {
	ReverseInteger obj = new ReverseInteger();
	@Test
	void test() {
		int a= 123;
		int result = obj.solution(a);
		 assertEquals(321, result);
	}
	
	@Test
	void test1() {
		int a= -123;
		int result = obj.solution(a);
		 assertEquals(-321, result);
	}
	
	@Test
	void test2() {
		int a= 120;
		int result = obj.solution(a);
		 assertEquals(21, result);
	}
}
