package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		utilities u = new utilities();
		u.multiply(n);

	}

}
