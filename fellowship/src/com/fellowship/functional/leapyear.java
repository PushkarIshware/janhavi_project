package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter year: ");
     String n = sc.nextLine();
	 utilities u = new utilities();
		u.leap(n);
	}

}
