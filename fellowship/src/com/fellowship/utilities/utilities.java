package com.fellowship.utilities;
import com.fellowship.functional.*;

public class utilities {

	public static void multiply(int a) {
		// TODO Auto-generated method stub
		int c;
		c= a*2;
		System.out.println(c);
		

	}

	public void change(String n) {
		// TODO Auto-generated method stub
		if (n.length()>=3)
		{
		System.out.println("hi "+n);
		namechange.main(null);
		}
		else
		{
			System.out.println("enter name of length greater than or equal to 3");
            namechange.main(null);		
		}
		
		
	}

	public void flip(double n) {
		// TODO Auto-generated method stub
		double count = 1;
		double r;
		double h=0;
		double t=0;
		while(count<n)
		{
		r=Math.random();
		if(r<=0.5)
		{
			h++;
		}
		count++;
		}
		double perhead=(h/n)*100;
		double pertail=((h-t)/n)*100;
		System.out.println("percent heads= "+perhead);
		System.out.println("percent tails= "+pertail);
		
		
	}


	public void leap(String n) {
		// TODO Auto-generated method stub
		if(n.length()==4)
		{
			int year = Integer.parseInt(n);
			if((year % 4 ==0 ) || (year % 400 ==0 ) && (year % 100 !=0 ) )
			{
				System.out.println("it is leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
		}
		else
		{
			System.out.println("input should be of 4 digits");
			leapyear.main(null);
		}
	}

	public void table(int n) {
		// TODO Auto-generated method stub
		int p=0;
		if(0 <= n && n< 31)
		{
			while(p<=n)
			{
			System.out.println("2 to the power of"+p+"="+Math.pow(2, p));	
			p++;
			}
			
		}
		else
		{
			System.out.println("value of N should satisfy the condition 0 <= N < 31");
			powerfunction.main(null);
		}
	}

	public void har(float n) {
		// TODO Auto-generated method stub
		float p=1;
		float r = 0;
		if(n!=0)
		{
			while(n>0)
			{
				 r = r + (1/n);
				System.out.println(r);
				n--;
			}
			System.out.println("final: "+r);
		}
		else
		{
			System.out.println("value of N should satisfy the condition");
			harmonic.main(null);
		}
	}

}
