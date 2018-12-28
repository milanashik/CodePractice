package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.RomanToInteger;

class RomanToIntegerTest {
	RomanToInteger obj = new RomanToInteger();
	@Test
	void test() {
		int input = 3;
		String s ="III";
		int result = obj.romanToInt(s);
		assertEquals(input, result);
	}
	@Test
	void test1() {
		int input = 4;
		String s ="IV";
		int result = obj.romanToInt(s);
		assertEquals(input, result);
	}
	@Test
	void test2() {
		int input = 58;
		String s ="LVIII";
		int result = obj.romanToInt(s);
		assertEquals(input, result);
	}
	@Test
	void test3() {
		int input = 1994;
		String s ="MCMXCIV";
		int result = obj.romanToInt(s);
		assertEquals(input, result);
	}
}
