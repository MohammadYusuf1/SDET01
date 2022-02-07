package javaprogram;

import java.util.Iterator;

public class SameDiffInGivenAry {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,7};
		int count=1;
		for (int i = 0; i < a.length-1; i++) {
			
			if(a[i+1]-a[i]==1)
			{
			    count++;	
			}
			
		}
		
		if(count==a.length)
		{
			System.out.println("arry is having same diff");
		}
		else
		{
			System.out.println("arry is not having same diff");
		}
	}

}
