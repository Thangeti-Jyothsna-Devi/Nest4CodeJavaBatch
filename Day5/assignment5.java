/** Assignment5 **/
package day5;
import java.util.Scanner;
public class assignment5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number1:");
		int n=sc.nextInt();
		int i=0,j=0;
		for(i=1;i<=n;i++) {
			for (j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<=n-1;i++)
		{
		    for (j=n-1;j>=i;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		sc.close();
		
	}
	}
