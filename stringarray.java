import java.io.*;
import java.util.Scanner;
public class stringarray
{
	public static void main (String[] args) throws IOException
	{
		
	String[] name= new String[100];
	int names = 0;
	
	
	System.out.println("how many names:");
	BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	String inS = null;
	inS = stdin.readLine();
	names = Integer.parseInt( inS );
	
	for (int i=1; i<= names; i++) {
		name[i]="test";
		System.out.println("Enter name "+i+":");
	name[i]=stdin.readLine();
	
	}
	
	for (int i=1; i<= names; i++) {
		System.out.println("name "+i+":"+name[i]);	
		
		}
	
		
	
		

		
	}
}