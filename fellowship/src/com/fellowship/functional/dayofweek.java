package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class dayofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("month starts from 1 and day starts from 0(0 for sunday)");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day: ");
		int d = sc.nextInt();
		System.out.println("enter month: ");
		int m = sc.nextInt();
		System.out.println("enter year: ");
		int y = sc.nextInt();
		
		
 utilities.dayweek(d,m,y);
	}

}
