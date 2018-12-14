package com.fellowship.functional;

import java.util.Scanner;

import com.fellowship.utilities.utilities;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        
        int ad[][];
        ad = new int[3][3];
        

        for (int dr=0; dr<ad.length; dr++)
        {    
            for (int dc=0;dc<ad.length; dc++)
            {
                System.out.println("enter values["+dr+","+dc+"]:");
                
                int p1=sc.nextInt();
                ad[dr][dc]=p1;    
            }
        }
        
        
        utilities.readint(ad);

	}

}
