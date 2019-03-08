package main;

import java.util.ArrayList;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space 
 * characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space 
characters only.

Example:

Input: "Hello World"
Output: 5
 */
public class LastWordLength {
	final static String SEPERATOR =" ";
	public int lengthOfLastWord(String s) {
        int length =0;
        String[] str = s.split(SEPERATOR);
        if(str.length > 0)
        {
        	length = str[str.length-1].length();
        }
		return length;
		//return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}
