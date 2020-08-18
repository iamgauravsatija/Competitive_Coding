/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		/*
		Steps:
			1. Take the input
			2. Use the modulus operator (%) and check the remainder
			3. If remainder is 0 increment the value by one else decrement
		*/
		
		int temp;
		Scanner scanner = new Scanner(System.in);
		temp = scanner.nextInt();
		temp = ( (temp%4) == 0 ) ? (temp+=1) : (temp-=1);
		System.out.print(temp);

	}
}

