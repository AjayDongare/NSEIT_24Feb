package corejava24feb;

public class TestFund
{
	int bal;
	public TestFund()
	{
		bal=10000;
	}
	public void checkFund(int fund)
	{
		int tbal=bal-fund;
		if(bal>bal && tbal>5000)
		
		bal=bal-fund;
		else 
			throw new InSufficentFundException();
	}	
	public void checkBalance()
	{
		System.out.println("The Available Balance :"+bal);
	}
}
