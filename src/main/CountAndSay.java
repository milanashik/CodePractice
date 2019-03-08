package main;
/*
 * The count-and-say sequence is the sequence of integers with the first five
 *  terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say 
sequence.

Note: Each term of the sequence of integers will be represented as a string.
 */
public class CountAndSay {
	public String countAndSay(int n) {
        String s = "1";   
        for(int i = 0; i < n-1; i++)
        	s = stringSequence(s);
       return s;
    }
    
    public String stringSequence(String s)
    {
        StringBuilder str = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i =1; i< s.length(); i++)
        {
         if(c == s.charAt(i))
         {
        	 count++; 
         }
         else {
        	 str.append(count).append(c);
        	 c = s.charAt(i);
        	 count =1;
         }
        
        }
        str.append(count).append(c);
        return str.toString();
    }
}
