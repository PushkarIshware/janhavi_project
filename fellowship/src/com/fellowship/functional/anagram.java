package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter string1 : ");
	     String n = sc.nextLine();
	     System.out.println("enter string2 : ");
	     String m = sc.nextLine();
	     
	     utilities.anagramcheck(n,m);
	}

}
