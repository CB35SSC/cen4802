package fib;

public class Main {
	/**
	* Returns the value's result of the Fibonacci sequence
	*
	* @param  n  the value being input into the formula
	* @return      the value
	* @see         Numbers
	*/
	 public static long fib(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
	   }	
	
	public static void main(String[] args) {
		
		System.out.println("The 10th fibonacci number is: " + fib(10));	

	}

}
