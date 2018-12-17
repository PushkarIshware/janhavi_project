package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class searchtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,5,6,8,9};
Scanner sc = new Scanner(System.in);
System.out.println("enter element to be search: ");
int key = sc.nextInt();
utilities.searchbinary(arr,key);
	}

}
