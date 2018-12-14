package com.fellowship.utilities;
import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

import com.fellowship.functional.*;

public class utilities {

	private static final int USER = 0;
	private static final int COMPUTER = 0;
	private static final int EMPTY = 0;
	private static final int STALEMATE = 0;
	private static final int NONE = 0;

	public static void multiply(int a) {
		// TODO Auto-generated method stub
		int c;
		c= a*2;
		System.out.println(c);
		

	}

	public void change(String n) {
		// TODO Auto-generated method stub
		String r;
		if (n.length()>=3)
		{
		//System.out.println("change to:");
		//String c = "changed to: ";
		//r = n.replace(n, c);
		//System.out.println(n+" is replaced with "+r);
			String m= "Hello <<username>>,how are you?";
			r = m.replace("<<username>>", n);
		    System.out.println(r);
		
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

	public void windc(double t, double v) {
		// TODO Auto-generated method stub
		if(t<50 && v<120 && v>3)
		{
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
		}
		else
		{
			System.out.println("condition is not satisfied");
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void game() {
		// TODO Auto-generated method stub
		utilities u = new utilities();
		final int EMPTY =0;
		final int STATEMENT = 0;
	     int winner;
		final int USER=0;
		final int COMPUTER=0;
		final int NONE = 0;
		int moveof = 0;
		int turn = USER;
		
		int[][] board = new int [3][3];
		
		u.print_board(board);
		
		while(true)
		{
			if(turn == USER)
			{
				System.out.println("your move");
				moveof = -1;
				while(moveof<0 || moveof>9 && board[moveof/3][moveof%3]!=EMPTY)
				{
					System.out.println("choose move between 0-8: ");
				//	System.out.println(moveof+ " "+System.console().readLine());
					//moveof = Integer.parseInt(System.console().readLine());
					Scanner scanner=new Scanner(System.in);
					moveof=scanner.nextInt();
					System.out.println(moveof);
				}
			}
				else
				{
					moveof = computer_move(board);
					System.out.println("computer move: "+moveof );
				}
			board[(int)(moveof/3)][moveof%3] = turn;

			u.print_board(board);
			winner = u.checkwinner(board);
		
			if(winner!=NONE)
			{
				break;
			}
			if(turn==COMPUTER)
			{
				turn = USER;
			}
			else
			{
				turn= COMPUTER;
			}
			
		}
			if(USER==winner)
			{
				System.out.println("user win");
			}
			else if(COMPUTER==winner)
			{
				System.out.println("computer win");
			}
			else
			{
				System.out.println("tie");
			}
			}
	
		public static void print_board(int[][] board) {
			// TODO Auto-generated method stub
			
			System.out.print(printChar(board[0][0]));
			System.out.print("|");
			System.out.print(printChar(board[0][1]));
			System.out.print("|");
			System.out.println(printChar(board[0][2]));
			System.out.println("-----");
			System.out.print(printChar(board[1][0]));
			System.out.print("|");
			System.out.print(printChar(board[1][1]));
			System.out.print("|");
			System.out.println(printChar(board[1][2]));
			System.out.println("-----");
			System.out.print(printChar(board[2][0]));
			System.out.print("|");
			System.out.print(printChar(board[2][1]));
			System.out.print("|");
			System.out.println(printChar(board[2][2])); 
	}

	private static char printChar(int i) {
			// TODO Auto-generated method stub
		if(i==USER)
		{
			return 'x';
		}
		else if(i==COMPUTER)
		{
			return 'o';
		}
		else if(i==EMPTY)
		{
			return ' ';
		}
		return 0;
		
		}

	private static int checkwinner(int[][] board) {
		// TODO Auto-generated method stub
		if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
		    return board[0][0];

		if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
		    return board[1][0];

		if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
		    return board[2][0];

		
		if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
		    return board[0][0];

		
		if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
		    return board[0][1];

		
		if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
		    return board[0][2];

		
		if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		    return board[0][0];

		
		if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
		    return board[0][2];

		if(board[0][0] == EMPTY || 
	           board[0][1] == EMPTY || 
	           board[0][2] == EMPTY || 
		   board[1][0] == EMPTY ||
		   board[1][1] == EMPTY ||
		   board[1][2] == EMPTY ||
		   board[2][0] == EMPTY ||
		   board[2][1] == EMPTY ||
		   board[2][2] == EMPTY)
		    return NONE;

		return STALEMATE;
		
	}

	private static int computer_move(int[][] board) {
		// TODO Auto-generated method stub
		int moveof = (int)(Math.random()*9);

		while(board[moveof/3][moveof%3] != EMPTY) 
		    moveof = (int)(Math.random()*9);

		return moveof;
	}
private static long starttime=0;
private long endtime=0;
private long elapse;

	public static void start() {
		// TODO Auto-generated method stub
		utilities u = new utilities();
		Scanner sc = new Scanner(System.in);
		starttime=System.currentTimeMillis();
		System.out.println("this is start time: "+starttime);
		System.out.println("Press 1 to stop");
        int st=sc.nextInt();
        if (st==1) {
            u.stop();
            u.elapsed();
        }
        else {
            System.out.println("Try again");
        }
    }
    public void stop() {
        endtime=System.currentTimeMillis();
        System.out.println("Stop Time is: "+endtime);
       
    }
    public void elapsed() {
        elapse=endtime-starttime;
        System.out.println("time Elapsed :"+elapse);
    }
		
	
public static void readint(int ad[][]) {
    // TODO Auto-generated method stub
    PrintWriter pw = new PrintWriter(System.out);

    for (int r=0; r<ad.length; r++)
    {
        for (int c=0; c<ad.length; c++)
        {
            int z=ad[r][c];
        
        pw.print(z+"\t");
        }
        pw.println();
        
        pw.flush();
    }
	
}
}
