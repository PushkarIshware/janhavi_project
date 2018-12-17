package com.fellowship.utilities;
import java.io.Console;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.fellowship.functional.*;

public class utilities {

	

	private static Scanner input;
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
		else {
			t++;
		}
		count++;
		}
		double perhead=(h/n)*100;
		double pertail=((t)/n)*100;
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

	

	public void gamblergame(int stake, int goal, int turn) {
		// TODO Auto-generated method stub
		int bets=0;
		int wins=0;
		int i;
		int loss=0;
		
		for(i=0;i<turn;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				 if (Math.random() < 0.5) cash++;     // win $1
	                else   cash--;     // lose $1
	            }
	            if (cash == goal) {wins++; }
	            else
	            {loss++;}
	        }

	        // print results
	        System.out.println(wins + " wins of " + turn);
	        System.out.println("% of games won = " + 100.0 * wins / turn);
	        System.out.println("Avg bets = " + 1.0 * bets / turn);
	        System.out.println("loss: "+loss);
	    }

	public static void couponr(int n) {
		// TODO Auto-generated method stub
		int count = collect(n);
		System.out.println(count);          
       
	}

	private static int collect(int n) {
		// TODO Auto-generated method stub
		boolean[] b = new boolean[n];
		int count=0;
		int dis=0;
		
		while(dis<n)
			
		{
			int val = coupen(n);
			count++;
			if(!b[val])
			{
				dis++;
				b[val]=true;
			}
			
		}
		return count;
	}

	private static int coupen(int n) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*n);
		return a;
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
private static final int EMPTY=0;
private static final int none=0;
private static final int USER=1;
private static final int COMPUTER=2;
private static int stalement=3;
	public static void game() {
		int turn = COMPUTER;
		int[][] board = new int[3][3];
		int move,winner;
		
		print_board(board);
		while(true) {
		    if(turn == USER) {
			System.out.println("Your move");
			move = -1;
			while (move<0 || move>8 || board[move/3][move%3] != EMPTY) {
			    System.out.println("Please enter your move(0-8): ");
			    Scanner sc = new Scanner(System.in);
			    move = sc.nextInt();
			    
			    if(move>8)
			    {
			    	System.out.println("enter move between 0-8");
			    }
			    
			}
		    } else {
			move = computer_move(board);
			System.out.println("Computer move: " + move);
		    }

		  
		    board[(int)(move/3)][move%3] = turn;

		   
		    print_board(board);

		    winner = checkWinner(board);

		    if(winner != none)
			break;

		    if(turn == USER) {
			turn = COMPUTER;
		    } else {
			turn = USER;
		    }

		}
		
		switch(winner) {
		case USER:
		    System.out.println("You won!");
		    break;
		case COMPUTER: 
		    System.out.println("Computer won!");
		    break;
		default:
		    System.out.println("Tie!");
		    break;
		}
		/*if(winner==USER)
		{
			System.out.println("You won!");
		}
		if(winner==COMPUTER)
		{
			System.out.println("COMPUTER WON!");
		}
		if(winner!=USER && winner!=COMPUTER)
		{
			System.out.println("tie");
		}*/
	    }
	public static void print_board(int[][] board) {
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
	
	
	public static char printChar(int b) {
		
		switch(b) {
		case EMPTY:
		    return ' ';
		case USER:
		    return 'X';
		case COMPUTER:
		    return 'O';
		}
		return ' '; 
	}	
		/*if(b==EMPTY)
		{
			return ' ';
		}
		else if(b==USER)
		{
			return 'X';
		}
		else if (b==COMPUTER)
		{
			return 'O';
		}
		return 0;
	    }*/
	
	public static int checkWinner(int[][] board) {
		
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

		/*if(board[0][0] == EMPTY || 
	           board[0][1] == EMPTY || 
	           board[0][2] == EMPTY || 
		   board[1][0] == EMPTY ||
		   board[1][1] == EMPTY ||
		   board[1][2] == EMPTY ||
		   board[2][0] == EMPTY ||
		   board[2][1] == EMPTY ||
		   board[2][2] == EMPTY)
		    return none;*/

		return stalement;
	    }

	    public static int computer_move(int[][] board) {
		int move = (int)(Math.random()*9);

		while(board[move/3][move%3] != EMPTY) 
		    move = (int)(Math.random()*9);

		return move;
	    }
		

		
	
		//////////////////////////////////////////////////////////////////////////////////////////
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

public static void anagramcheck(String n, String m) {
	// TODO Auto-generated method stub
	if(n.length()!=m.length())
	{
System.out.println("no same length");	}
	n=n.toLowerCase();
	m=m.toLowerCase();
	char a[]=n.toCharArray();
	char b[]=m.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);

	if(Arrays.equals(a, b))
	{
		System.out.println("anagram");
		
	}
	else 
	{
		System.out.println("not anagram");
	}
	
}

public static void primenum() {
	// TODO Auto-generated method stub
	int i;
	int num=0;
	String numbers=" ";
	for(i=1;i<=1000;i++)
	{    int count=0;
		for(num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			numbers = numbers+i+" ";
		}
	}
	 System.out.println(numbers);
}

public static void condition() {
	// TODO Auto-generated method stub
	int i;
	int num=0;
	//String numbers=" ";
	for(i=1;i<=1000;i++)
	{    int count=0;
		for(num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{ 
			System.out.print("|"+i);
			palindrom(i);
				
		}
		
	}
	 //System.out.println(numbers);
}
public static void palindrom(int n) {
	
        int r,sum=0,temp;
        temp=n;    
          while(n>0){    
           r=n%10;
           sum=(sum*10)+r;    
           n=n/10;    
          }    
          if(temp==sum)
              
           System.out.print(" palindrome number");    
          /*else    
          System.out.println("not palindrome number"); */ 
        
        
    }

public static int searchbinary(int[] arr, int key) {
	// TODO Auto-generated method stub
	 int start=0;
     int end=arr.length-1;
     
     //System.out.println(start+" "+end);
     
     while(start <= end)
     {
         int mid = (start+end)/2;
         //System.out.println(mid);
         if(arr[mid]==key) {
             System.out.println(mid);
             }
         if(key<arr[mid])
         {
             end=mid-1;
         }
         else
         {
         start=mid+1;
         }
         
     }
     return -1;
     
 }
}






