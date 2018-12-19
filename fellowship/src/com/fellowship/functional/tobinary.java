package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class tobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any decimal number:");

       int n = s.nextInt();
      // utilities.binary(n);
      System.out.println(utilities.binary(n));
	}

}
