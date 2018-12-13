package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class powerfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter N: ");
	     int n = sc.nextInt();
		 utilities u = new utilities();
			u.table(n);
	}

}
