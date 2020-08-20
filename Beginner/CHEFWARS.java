/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */


/** @author iamgauravsatija */ 


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int health[] = new int[testCases];
		int power[]  = new int[testCases];

		for (int i = 0; i < testCases; i++){

			health[i] = scanner.nextInt();
			power[i]  = scanner.nextInt();
			
		}

		for (int i = 0; i < testCases; i++){
		
			int temp = (int) Math.floor( Math.log(health[i])/Math.log(2) ); 
			if ( power[i] < Math.pow(2, temp) ){
			
				System.out.println("0");			

			}else{
				System.out.println("1");
			}				

		}
		
	}
}
