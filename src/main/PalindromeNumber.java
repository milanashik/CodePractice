package main;

public class PalindromeNumber {
	public Boolean solution(int x)
	{
		if(x >= 0 && x < 10)
			return true;
		if(x < 0 || (x % 10 == 0))
            return false;
        int sum = 0;
        while(x > sum)
        {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
       return(sum == x || sum/10 == x);
	}
}
