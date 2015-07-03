import java.io.*;
import java.util.Scanner;
public class invokecar
{
	public static void main (String[] args) throws IOException
	{
	Car car1 = new Car();
	Car car2 = new Car();
	//invoke methods
	
	car1.changecolor("blue");
	car1.changespeed(100);
	car1.changehp(150);

	car2.changecolor("red");
	car2.changespeed(120);
	car2.changehp(180);
	
	car1.printStates();
	car2.printStates();
	}
	
		
	
		

		
	}