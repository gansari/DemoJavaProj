package com.patch.selenium.common;

public class ReusableMethods 
{
	
	public void multiply(int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication :" + c);
	}
	
	protected void test1(int a, int b, int c)
	{
		int d = a + b - c;
		System.out.println("Addition and Subtraction :" + d);
	}
	
	private void myPrivateMethod()
	{
		System.out.println("This is Private Method");
		//private hides from other classes within the package. public exposes to classes outside the package. protected is a version of public restricted only to subclasses
	}

}
