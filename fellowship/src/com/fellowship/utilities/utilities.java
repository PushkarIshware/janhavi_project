package com.fellowship.utilities;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

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



public static void searchbinary(int[] arr, int key) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	 int start=0;
     int end=arr.length-1;
        
     while(start <= end)
     {
         int mid = (start+end)/2;
        
         if(arr[mid]==key) {
             System.out.println("element found at position: "+mid);
             break;
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
     
     if(start>end)
     {
    	 System.out.println("not found");
     } 
     long endTime = System.currentTimeMillis();
 	long elapsed = (endTime-startTime)/1000;
 	System.out.println("\n time: "+elapsed);
     
 }

public static int[] countletter(String st)
{
	int count[]=new int[36];
    for(int i=0;i<st.length();i++)
    {
        char ch=st.charAt(i);
        if(ch>='A' && ch<='Z')
            count[ch-65]++;
        if(ch>='a' && ch<='z')
            count[ch-97]++;
        if(ch>='0' && ch<='9')
            count[ch-22]++;
    }
    return count;
	}

public static void searchbinarystring(String[] arr2, String key1) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	int start=0;
	int end = arr2.length-1;
	
	while(start<=end)
	{
		int mid = (start+end)/2;
		int a = key1.compareTo(arr2[mid]);
		if(a==0)
		{
			end=mid;
			System.out.println("found at : "+mid);
			break;
		}
		if(a>0)
		{
			start=mid+1;
			
		}
		else
		{
			end = mid-1;
		}
	}
	if(start>end)
	{
		System.out.println("not found");
	}
	long endTime = System.currentTimeMillis();
	long elapsed = (endTime-startTime)/1000;
	System.out.println("\n time: "+elapsed);
}

public static void insertionsort(int[] arr) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	for(int j=1;j<arr.length;j++)
	{
		int key = arr[j];
		int comp = j-1;
		while((comp>-1) && (arr[comp]>key))
		{
			arr[comp+1]=arr[comp];
			comp--;
		}
		arr[comp+1]=key;
	}
	System.out.println("\n after sort:");
	for(int j=0;j<arr.length;j++)
	{
	System.out.print(arr[j]+" ");
	}
	long endTime = System.currentTimeMillis();
	long elapsedb = (endTime-startTime)/1000;
	System.out.println("\n time: "+elapsedb);
}

public static void insertionsortstring(String[] arr2) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	String temp="";
	 for (int i=0;i<arr2.length-1;i++) {
	        for (int j =i+1;j<arr2.length-1;j++) {
	            if(arr2[i].compareToIgnoreCase(arr2[j])>0) {
	                temp = arr2[i];
	                arr2[i]=arr2[j];
	                arr2[j]=temp;
	               
	            }
	           
	        }
	       
	    }
	 System.out.println("\n after sort: ");
	    for (int e=0;e<arr2.length;e++) {
	        System.out.print(arr2[e]+" ");
	       
	    }
	    long endTime = System.currentTimeMillis();
		long elapsed = (endTime-startTime)/1000;
		System.out.println("\n time: "+elapsed);
}

public static void bubblesort(int[] arr) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	int n = arr.length;  
	int temp = 0;  
	int count = 0;
	for(int i=0; i < n; i++) // Looping through the array length
	{   
		for(int j=1; j < (n-i); j++)
		{  
		       
			if(arr[j-1]>arr[j])
			{   
			    
				
				temp=arr[j-1];
			    arr[j-1]=arr[j];
			    arr[j]=temp;     
			}  
              
		}  
		count++;
        System.out.println("\n pass : "+count);
        for(int t=0; t < n; t++) {
        	System.out.print(arr[t]+" ");
        }
	}  
	System.out.println("\n sorted array is : ");
	for(int t=0; t < n; t++) {
    	System.out.print(arr[t]+" ");
    }
	long endTime = System.currentTimeMillis();
	long elapsedb = (endTime-startTime)/1000;
	System.out.println("\n time: "+elapsedb);
} 




public static void bubblesortstring(String[] arr2) {
	// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	int n = arr2.length;  
	String temp;  
	int count = 0;
	for(int i=0; i < n; i++) // Looping through the array length
	{   
		for(int j=1; j < (n-i); j++)
		{  
		       
			if(arr2[j-1].compareToIgnoreCase(arr2[j])>0)
			{   
			    
				
				temp=arr2[j-1];
			    arr2[j-1]=arr2[j];
			    arr2[j]=temp;     
			}  
              
		}  
		count++;
        System.out.println("\n pass : "+count);
        for(int t=0; t < n; t++) {
        	System.out.print(arr2[t]+" ");
        }
	}  
	System.out.println("\n sorted array is : ");
	for(int t=0; t < n; t++) {
    	System.out.print(arr2[t]+" ");
    }
	long endTime = System.currentTimeMillis();
	long elapsed = (endTime-startTime)/1000;
	System.out.println("\n time: "+elapsed);
	//continueagain(array);
}

public static int que(int high, int low) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	if ((high - low)==1) {
	    return low;
	}
	
	int mid=(high+low)/2;
	System.out.println("Is Your number less than "+mid+"  1 to Yes orrrrrr 0 to NO");
	int a =sc.nextInt();
	if (a==1) {
	    return que(low, mid);
	}
	else {
	    return que(mid, high);
	    
}

}

public static void textread() throws IOException {
	// TODO Auto-generated method stub
	 File file =new File("/home/admin1/janhavi_project/sample.txt");
	    String values[] = null;
	    Scanner sc =new Scanner(System.in);
	      String line = null;
	     BufferedReader br = new BufferedReader(new FileReader(file));
	     while ((line = br.readLine()) != null) {
	           values = line.split(",");
	          for (String str : values) {
	            System.out.println(str);
	          }
	        }
	        br.close();
	        System.out.println("Enter Element to search  :");
	        String key2=sc.nextLine();
	        searchbinarystring(values,key2);
}

public static void insearch() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String a[] = new String[5];
	for (int i = 0; i < a.length; i++) {
		System.out.print("Enter names " + (i+1) + " : ");
	        a[i] = sc.nextLine();
	}
	    
	System.out.println("array :");
	for (int i = 0; i < a.length; i++) {
		
	        System.out.print(a[i] + "\n");
	}
	  
insertionsortstring(a);

    
    
}

public static void bubblesortread() {
	// TODO Auto-generated method stub
	int[] a=new int[6];
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter elements...");
    for(int j=0;j<6;j++)
        a[j]=sc.nextInt();
    System.out.println("Array elements are : ");
    for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
    bubblesort(a);
}





public static String[] mergeSort(String[] list) {
    String [] sorted = new String[list.length];
    if (list.length == 1) {
        sorted = list;
    } else {
        int mid = list.length/2;
        String[] L = null; 
        String[] R = null;
        if ((list.length % 2) == 0) {
            L = new String[list.length/2];
            R = new String[list.length/2];
        } else { 
            L = new String[list.length/2];
            R = new String[(list.length/2)+1];
        }
        int x=0;
        int y=0;
        for ( ; x < mid; x++) {
            L[x] = list[x];
        }
        for ( ; x < list.length; x++) {
            R[y++] = list[x];
        }
        L = mergeSort(L);
        R = mergeSort(R);
        sorted = mergeArray(L,R);
    }

    return sorted;
}

private static String[] mergeArray(String[] L, String[] R) {
    String[] merged = new String[L.length+R.length];
    int li = 0;
    int ri = 0;
    int mi = 0;
    int comp = 0;
    while (li < L.length || ri < R.length) {
        if (li == L.length) {
            merged[mi++] = R[ri++];
        } else if (ri == R.length) {
            merged[mi++] = L[li++];
        } else {  
            comp = L[li].compareTo(R[ri]);
            if (comp > 0) {
                merged[mi++] = R[ri++];
            } else if (comp < 0) {
                merged[mi++] = L[li++];
            } else { 
                merged[mi++] = L[li++];
            }
        }   
    }
    return merged;
}
static int [] note = {100,500,100,50,10,5,2,1};
static int index=0;
public static int totalnotes=0;

public static int vending(int amount , int[] note) {
	// TODO Auto-generated method stub
	
   
	int remaining;
	if(amount==0)
	{
return -1;	}
	else {
		
		
		if(amount>=note[index])
		{
			
			int calculatenote = amount / note[index];
			remaining = amount % note[index];
			amount = remaining;
			totalnotes += calculatenote;
			System.out.println(calculatenote+" of "+note[index]);
		}
		index++;
		
return vending(amount,note);	}
	
	
}

public static void dayweek(int d, int m , int y) {
	// TODO Auto-generated method stub
	
	if(d>0 && d<=31 && m>0 && m<=12) {
		
	int y0 = y - (14 - m) / 12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + (31*m0)/12) % 7;

    System.out.println(d0);
	}
	else {
		System.out.println("enter valid data");
		dayofweek.main(null);
	}
}
/*public static char[] c;
public static char[] f1;*/
public static void ftoc(double f) {
	// TODO Auto-generated method stub
	double c =(f - 32) * (0.56) ;
	System.out.println(c);
}

public static void ctof(double c1) {
	// TODO Auto-generated method stub
	double f1 =(c1 * (1.8)) + 32;
	System.out.println(f1);
}

public static void payment(double Y, double R, double P) {
	// TODO Auto-generated method stub
	double n = 12*Y;
	double r = R /(12*100);
	double z= Math.pow((1+r), (-n));
	double payment = (P*r)/( 1 - z);
	System.out.println("payment: "+payment);
}

public static void sqrn(int n) {
	// TODO Auto-generated method stub
	double epsilon = 1e-15; 
	double t = n; 
	 while (Math.abs(t - n/t) > epsilon*t) {
         t = (n/t + t) / 2.0;
     }
    
System.out.println(t);
}

public static String binary(int n) {
	// TODO Auto-generated method stub
	String z = Integer.toString(n,2);
	while(z.length()!=8)
	{
		z="0"+z;
	}
	return z;
	//System.out.println("binary number is :"+z);
	
}

public static void binarys(int n) {
	// TODO Auto-generated method stub
	String m=binary(n);
	final int mid = m.length() / 2; //get the middle of the String
	String[] parts = {m.substring(0, mid),m.substring(mid)};
	System.out.println(parts[0]); //first part
	System.out.println(parts[1]);
	String temp = parts[0];
	parts[0]=parts[1];
	parts[1]=temp;
	
	String l = parts[0]+ parts[1];
	System.out.println(l);
	int num = Integer.parseInt(l);
	int k =Integer.parseInt(l,2);
	System.out.println("new decimal: "+k);
	
}
	
}










