package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("t: ");
	     double t = sc.nextInt();
	     System.out.println("v: ");
	     double v = sc.nextInt();
	     utilities u = new utilities();
			u.windc(t, v);
	}
	

}
