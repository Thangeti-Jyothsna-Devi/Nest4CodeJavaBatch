/** Assignment3 **/
package day3;

import java.util.Scanner;

public class assignment3 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String 1:");
		String s1=input.next();
		System.out.print("Enter the String 2:");
		String s2=input.next();
		String s3=s2.substring(s2.length()-2)+s1.substring(2, s1.length()-2)+s2.substring(0,2);
		String s4=s1.substring(s1.length()-2)+s2.substring(2, s2.length()-2)+s1.substring(0,2);
		System.out.println("String1:"+s3);
		System.out.println("String2:"+s4);
		input.close();
	}

}
