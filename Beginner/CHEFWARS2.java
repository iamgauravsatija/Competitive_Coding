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
		int health, power;

		for (int i=0; i < testCases; i++){

			health = scanner.nextInt();
			power  = scanner.nextInt();

			while( health > 0 && power > 0){
			
				health = health - power;
				power = power/2;
				System.out.println(health + "-" + power);

			}

			
			if ( health<= 0 ){
			
				System.out.println("1");			

			}else{
				System.out.println("0");
			}				

		}
		
	}
}
