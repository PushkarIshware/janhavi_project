package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class monthlypayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter no of years: ");
double Y = sc.nextInt();
System.out.println("enter R per cent: ");
double R = sc.nextInt();
System.out.println("enter principal amount : ");
double P = sc.nextInt();

utilities.payment(Y,R,P);
	}

}
