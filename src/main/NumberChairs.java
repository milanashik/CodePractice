package main;

import java.util.Arrays;

public class NumberChairs {

	public int Solution(int[] a, int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		int counter =1;
		int chairs = 1;
		
		int i=1, j=0;
		
		while(i< a.length && j< a.length)
		{
			if(a[i] < b[j])
			{
				counter++;
				i++;
				if(counter > chairs)
					chairs = counter;
			}
			else
			{
				counter--;
				j++;
			}
		}
		
		return chairs;
	}

}
