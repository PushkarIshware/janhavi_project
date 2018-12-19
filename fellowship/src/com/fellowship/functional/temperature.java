package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("1: fahrenheit to Celsius \n 2: Celsius to fahrenheit ");
String choice = sc.nextLine();
switch(choice)
{
case "1":
	System.out.println("enter temp in fahrenheit: ");
	double f = sc.nextInt();
	utilities.ftoc(f);
	
	break;
	
case "2":
	System.out.println("enter temp in Celsius: ");
	double c1 = sc.nextInt();
	utilities.ctof(c1);
	
	break;
	
	default:
	System.out.println("invalid");
}
	}

}
