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
	public static void prime_factors(int number) {
        // TODO Auto-generated method stub
        

        System.out.print("The prime iization of " + number + " is: ");

        // for each potential factor
        for (long i = 2; i*i <= number; i++) {

            // if factor is a factor of number, repeatedly divide it out
            while (number % i == 0) {
                System.out.print(i + " ");
                number = (int) (number / i);
            }
        }

        // if biggest factor occurs only once, number > 1
        if (number > 1)
            {System.out.println(number);}
        else       {System.out.println();}
    }

	

	public void gamblergame(int s, int g, int t) {
		// TODO Auto-generated method stub
		int bets=0;
		int wins=0;
		int i;
		
		for(i=0;i<t;i++)
		{
			int c=s;
			while(c>0 && c<g)
			{
				bets++;
				 if (Math.random() < 0.5) c++;     // win $1
	                else   c--;     // lose $1
	            }
	            if (c == g) wins++;                // did gambler go achieve desired goal?
	        }

	        // print results
	        System.out.println(wins + " wins of " + t);
	        System.out.println("Percent of games won = " + 100.0 * wins / t);
	        System.out.println("Avg bets = " + 1.0 * bets / t);
	    }

	public static int couponr(int n) {
		// TODO Auto-generated method stub
		boolean[] isCollected = new boolean[n];  
        int count = 0;                           
        int distinct  = 0;                       // number of distinct card types collected

        // repeat until you've collected all n card types
        while (distinct < n) {
            int value = (int) (Math.random()*n);            // pick a random card 
            count++;                             // one more card
            if (!isCollected[value]) {           // discovered a new card type
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
	}

	public static void triple(int[] a, int n_length) {
		// TODO Auto-generated method stub
		
		  
		boolean found = true;
        for (int i=0; i<n_length-2; i++)
        {
            for (int j=i+1; j<n_length-1; j++)
            {
                for (int k=j+1; k<n_length; k++)
                {
                    if (a[i]+a[j]+a[k] == 0)
                    {
                        System.out.print(a[i]);
                        System.out.print(" ");
                        System.out.print(a[j]);
                        System.out.print(" ");
                        System.out.print(a[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        } 
    }

	public void distance(int s, int a) {
		// TODO Auto-generated method stub
		double dist = Math.sqrt(s*s + a*a);
		 
        
        System.out.println("distance from (" + s + ", " + a + ") to (0, 0) = " + dist);
		
	}

	public void quadratic(double s, double a) {
		// TODO Auto-generated method stub
		double discr = s*s - 4.0*a;
        double sqr =  Math.sqrt(discr);

        double root1 = (-s + sqr) / 2.0;
        double root2 = (-s - sqr) / 2.0;

        System.out.println(root1);
        System.out.println(root2);
	} 
		
	

	
}
