class FactorialTest {    //calculates the factorial of that number.

  public static void main(String args[]) {
	  int n;
	  int i;
	  long result;
	  for (i=1; i <=10; i++)  {
	      result = factorial(i);
	      System.out.println(result);
	    }

	  } // main ends here
 
  static long factorial (int n) {

	  int i;
	  long result=1;
	  
	  for (i=1; i <= n; i++) {
	   result *= i;
	  }
	  
	  return result;

	} // factorial ends here
}