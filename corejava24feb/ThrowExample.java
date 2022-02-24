package corejava24feb;

public class ThrowExample 
{

	public static void main(String[] args) 
	{
		try
		{
		int a=100, b=20;
		System.out.println("Inside the try block");
		if(a<b)
		throw new ArrayIndexOutOfBoundsException();
		else
		throw new NullPointerException();
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside the Array Index Out Of Bounds Exception");
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Inside the Null Pointer Exception Exception");
		}
		
		finally
		{
			System.out.println("Inside the Finally Block");
		}
	}

}

