package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter stake: ");
	     int stake = sc.nextInt();
	     System.out.println("enter goal: ");
	     int goal = sc.nextInt();
	     System.out.println("enter trials: ");
	     int turn = sc.nextInt();
		 utilities u = new utilities();
			u.gamblergame(stake, goal, turn);
	}

}
