package corejava24feb;

import java.util.Scanner;

public class TestFundMain 
{

	public static void main(String[] args)
	{
		TestFund t = new TestFund();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Fund to Withdraw...");
		int fund = sc.nextInt();
		
		
		try 
		{
			t.checkFund(fund);
			t.checkBalance();
		
		}
		catch(InSufficentAgeException e) 	
		{
			System.out.println(e);
		}
	}
}

