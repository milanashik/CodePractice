package main;

public class ReverseInteger {
	public int solution(int x) {
		int sum =0;
	     while(x != 0)
	     {
	         int pop = x%10;
	         x = x/10;
	         if (sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE / 10 && pop > 7)) 
	        	 return 0;
	         if (sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE / 10 && pop < -8)) 
	        	 return 0;
	         sum =sum * 10 + pop;
	     }
	        return sum;
		
	}
}
