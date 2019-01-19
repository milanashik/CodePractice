/*
a * For example, two is written as II in Roman numeral, just two one's 
 * added together. Twelve is written as, XII, which is simply X + II. 
 * The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
 However, the numeral for four is not IIII. Instead, the number four is written as IV.
  Because the one is before the five we subtract it making four. The same principle 
  applies to the number nine, which is written as IX. There are six instances where
   subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within
 the range from 1 to 3999.
 */


package main;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
        int result=0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char arr[] = s.toCharArray();
        int i = s.length();
        result += map.get(arr[i-1]);
        if(i == 1)
            return result;
        i -= 2;
        do
        {
            if(map.get(arr[i]) < map.get(arr[i+1]))
            {
                result -= map.get(arr[i]);
            }
            else
            result += map.get(arr[i]) ;
            i--;
        } while(i >= 0);
        return result;
    }
}
