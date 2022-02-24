package corejava24feb;

import java.io.IOException;

public class ExceptionHandlinExample
{

	public static void main(String[] args)
	{
	
		int a = 100, b = 0, c;
		 int ar[] = { 1, 2, 3 };
		 try 
		 {
			 System.out.println("Inside the try block..");
			 System.out.println(ar[4]);
			 c = a / b;
			 System.out.println("The c :" + c);
			 System.out.println("After c value...");
		 }
		 catch (ArrayIndexOutOfBoundsException e) 
		 {
			 System.out.println("inside the ArrayIndex catch block");

		 } 	

		
		
		 catch (ArithmeticException e) 
		 {
			 System.out.println("inside the Arthimetic catch block");

		 } 	
			 	

		 catch (Exception e) 
		 {
			 System.out.println("inside the ArrayIndex catch block");

		 }

		 finally
		 {
			 System.out.println("Inside the finally block");
		 }
		 System.out.println("After the finally block");

	 }
}
