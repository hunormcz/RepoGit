import java.io.*;
import java.util.Scanner;
public class callclass
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );

		String inS;
		int num = -1;
		
while (num<0) {
		System.out.println("Enter an integer number");
		inS = stdin.readLine();
		num = Integer.parseInt( inS ); // convert inS to int using wrapper classes

		if ( num < 0 )  // true-branch
		{
	      System.out.println("The number " + num + " is negative");
		   System.out.println("negative number are less than zero"); 
		}
		else   // false-branch
		{
		   System.out.println("The number " + num + " is positive");
		   System.out.print ("The Factorial for your number is: ");
		}
		
	}
		
FactorialTest x = new FactorialTest();
long s = FactorialTest.factorial(num);

System.out.println(s); 
System.out.println("End of program");// always executed
		
	}
}