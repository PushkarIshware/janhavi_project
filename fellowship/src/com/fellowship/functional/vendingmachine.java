package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class vendingmachine {
	static int [] note = {100,500,100,50,10,5,2,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter amount: ");
int amount = sc.nextInt();
utilities.vending(amount,note);
System.out.println("total notes: "+utilities.totalnotes);
	}

}
