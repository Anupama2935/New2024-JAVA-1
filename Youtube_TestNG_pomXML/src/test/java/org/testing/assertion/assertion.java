package org.testing.assertion;

public class assertion {
	
	public static void assert1(String expected , String actual)
	{
		if (expected.equals(actual))
		{
			System.out.println("Assertion is Passed");
		}
		
		else 
		{
			System.out.println("Assertion is Failed");
		}
	}

}
