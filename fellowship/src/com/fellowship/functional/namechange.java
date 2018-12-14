package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class namechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		utilities u = new utilities();
		System.out.println("enter username:");
		String n = sc.nextLine();
		//System.out.println("change to:");
		//String c = sc.nextLine();
		u.change(n);


	}

}
