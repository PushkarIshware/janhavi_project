package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter stake: ");
	     int s = sc.nextInt();
	     System.out.println("enter goal: ");
	     int g = sc.nextInt();
	     System.out.println("enter trials: ");
	     int t = sc.nextInt();
		 utilities u = new utilities();
			u.gamblergame(s, g, t);
	}

}
