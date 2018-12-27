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

}
