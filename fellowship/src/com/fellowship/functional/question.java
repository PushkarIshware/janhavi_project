package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter num of questions ");
int k =sc.nextInt();
int n = (int) Math.pow(2, k);
System.out.println("Think of an integer between 0 and"+(n-1));
int secret = utilities.que(0, n);
System.out.println("Your number is  "+secret);
	}

}
