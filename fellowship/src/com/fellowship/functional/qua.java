package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class qua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter no1: ");
	     double s = sc.nextInt();
	     System.out.println("enter no2: ");
	     double a = sc.nextInt();
	     utilities u = new utilities();
			u.quadratic(s, a);
	}

}
