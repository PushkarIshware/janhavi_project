package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class edistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter first point: ");
	     int s = sc.nextInt();
	     System.out.println("enter second point: ");
	     int a = sc.nextInt();
	     utilities u = new utilities();
			u.distance(s, a);
	}

}
