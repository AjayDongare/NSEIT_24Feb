package corejava24feb;

import java.util.function.Supplier;

public class FunctionSupplier 
{

	public static void main(String[] args) 
	{
		
		Supplier<Double> s = ()->
		{
			return Math.random();
		};
			System.out.println(s.get());
			System.out.println(s.get());
	}

}
