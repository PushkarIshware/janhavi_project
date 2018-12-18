package com.fellowship.functional;

import java.util.Arrays;
import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class searchtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,5,2,4,1};

String arr2[]= {"janhavi","pushkar","nikhil","gautami","kimaya"};

String choice;
Scanner sc = new Scanner(System.in);
System.out.println("enter choice----\n 0:binary search for string \n 1:binary search for integer \n "
		+ "2:insertion sort for integer \n 3:insertion sort for string \n 4:bubble sort for integer \n "
		+ "5:bubble sort for string:");
choice = sc.nextLine();


switch(choice)
{
case "0":
	Arrays.sort(arr2);	
for(int i=0;i<=arr2.length-1;i++)
{
	System.out.print(arr2[i]+" ");
	}
System.out.println("\n enter string to be search: ");
String key1 = sc.nextLine();

utilities.searchbinarystring(arr2,key1);
break;

case "1":
	Arrays.sort(arr);
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
		}
	System.out.println("\n enter integer to be search: ");
	int key = sc.nextInt();
	utilities.searchbinary(arr,key);
break;

case "2":
	System.out.println("\n array before sort: ");
	for(int i=0;i<=arr.length-1;i++)
	{   
		System.out.print(arr[i]+" ");
		}
	
	
	utilities.insertionsort(arr);
break;

case "3":
	System.out.println("\n array before sort: ");
	for(int i=0;i<=arr2.length-1;i++)
	{   
		System.out.print(arr2[i]+" ");
		}
	
	
	utilities.insertionsortstring(arr2);
break;

case "4":
	System.out.println("\n array before sort: ");
	for(int i=0;i<=arr.length-1;i++)
	{   
		System.out.print(arr[i]+" ");
		}
	
	
	utilities.bubblesort(arr);
break;

case "5":
	System.out.println("\n array before sort: ");
	for(int i=0;i<=arr2.length-1;i++)
	{   
		System.out.print(arr2[i]+" ");
		}
	
	utilities.bubblesortstring(arr2);
break;

default:
	System.err.println("invalid");
	break;
	
	

}	
}
}
