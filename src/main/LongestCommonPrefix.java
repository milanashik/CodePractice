package main;
//horizontal and vertical scanning or divide and conquer
//vartical is better than horizontal in cases where very short string
//is at the end of array
//Divide & conquer (space complexity O(m.log(n)))
//Time complexity for each approach will be O(S)
//Another approach: binary search tree <-- selected this
//Time complexity : O(S.log(n)) Space complexity : O(1). 
//Input: ["flower","flow","flight"]
//Output: "fl"
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
	       if (strs == null || strs.length == 0)
	        return "";
	        
	        int minLen = strs[0].length();
	        for(String str : strs)
	            minLen = Math.min(minLen, str.length());
	        //binary search technique
	        int low =1;
	        int high = minLen;
	        while(low <= high)
	        {
	            int middle = (low + high) / 2;
	        if (isCommonPrefix(strs, middle))
	            low = middle + 1;
	        else
	            high = middle - 1;
	        }
	        
	       return strs[0].substring(0, (low + high) / 2);
	    }
	    
	    private boolean isCommonPrefix(String[] strs, int len){
	    String str1 = strs[0].substring(0,len);
	    for (int i = 1; i < strs.length; i++)
	        if (!strs[i].startsWith(str1))
	            return false;
	    return true;
	}
}
/*
 public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";        
        String prefix = strs[0];        
            for(int i = 1; i < strs.length; i++) {
                while(strs[i].indexOf(prefix) != 0 && prefix.length() > 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }                
            }
        return prefix;
    }
    Copied from Internet
*/