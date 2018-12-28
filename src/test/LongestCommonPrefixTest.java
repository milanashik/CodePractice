package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.LongestCommonPrefix;

public class LongestCommonPrefixTest {
	LongestCommonPrefix obj = new LongestCommonPrefix();
	
	@Test
	public void test() {
    	String[] strs = {"flower","flow","flight"};
    	String result = obj.longestCommonPrefix(strs);
    	assertEquals("fl", result);
	}
	
}
