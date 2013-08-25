package com.patch.selenium.common;

public class SecuresMethods extends ReusableMethods
{
	 
	int a; int b; int c;

	public void testMethodCall()
	{
		int a;
		
		test1(10,20,5);
	}
	
	public void constructorExample()
	{
		int c;
		c = a + b;
		System.out.println("Baper wealth - CE1 : " + c);
	}
	
	public SecuresMethods(int x, int y)
	{
		this.a = x;
		this.b = y;
	}
	
	public SecuresMethods(int x, int y, int z)
	{
		this.a = x;
		this.b = y;
		this.c = z;
	}
	
	// Function or Method overloading
	
	public void constructorExample2()
	{
		int d;
		d = a * b * c;
		System.out.println("Baper Wealth - CE2 : " + d);		
	}
}
