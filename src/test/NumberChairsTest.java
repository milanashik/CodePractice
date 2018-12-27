package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.NumberChairs;

class NumberChairsTest {
 
	NumberChairs obj = new NumberChairs();
	@Test
	void test() {
		int[] S = {1,2,5,6,3};
        int[] E = {5,5,6,7,8};
        int result = obj.Solution(S,E);
        assertEquals(3, result);
	}
	
	@Test
	void test1() {
		int[] S = {1,2,3,4,6};
        int[] E = {5,5,5,5,8};
        int result = obj.Solution(S,E);
        assertEquals(4, result);
	}

}
