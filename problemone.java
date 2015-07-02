import java.io.*;

public class problemone
{
	public static void main (String[] args) throws IOException
	{
	int start=1;
	int end=1;
	String inS;
	int guess=0;
	BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	// Read Interval:
	//class print	
		logging x = new logging();
	while (end-start<3)
	{
	
	
	
		
	x.DisplayString("Enter the start of the interval ");
	inS = stdin.readLine();
	start = Integer.parseInt( inS );
	x.DisplayString("Enter the second number: ");
	inS = stdin.readLine();
	end = Integer.parseInt( inS );
		if (end-start<3) 
		{
			x.DisplayString("The interval does not contain at least 3 numbers, please enter a bigger interval");
		
		}
		
		
	}
	x.DisplayString("Think of a number between: "+ start+" and "+end);

	String input="0";
	
	while(!input.equals("y"))
	{
		//guess = middle of interval (+1 if its odd number)
		if ((start+end)%2==0){
			guess=(start+end)/2;
		}
		else{
			guess=(start+end)/2+1;
				}
		
		//output guess
		x.DisplayString("Is " + guess + " your number? (y/h/l)");
				input = stdin.readLine();
		
		
		//change interval according to input
		if ((input.equals("l")) && (guess-1>=start)) 
		{
			end=guess-1;
		}
		else if (input.equals("h")  && (guess+1<=end))
		{
		start=guess+1;	
		}
		else if (!input.equals("y"))
			x.DisplayString("Liar! Enter correct values ");
		
	
		
		
	}
	
	x.DisplayString("Your number is "+ guess+"!");
	
	}



}

	

	
		
	
		

	
	
