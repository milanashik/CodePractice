package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TwoSum;
class TwoSumTest {
	TwoSum operate = new TwoSum();
	@Test
	public void testSum() {
    	int[] a ={2, 7, 11, 15};
		int[] test = operate.twoSum(a, 9);
		int[] result = {0,1} ;
		assertArrayEquals(test, result);
	}
	
	@Test
	public void testSum1() {
    	int[] a ={2, 11, 12, 7};
		int[] test = operate.twoSum(a, 9);
		int[] result = {0,3} ;
		assertArrayEquals(test, result);
	}

}
