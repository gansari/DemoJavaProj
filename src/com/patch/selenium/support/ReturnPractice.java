package com.patch.selenium.support;

public class ReturnPractice 
{
	public int test1(int a, int b)
	{
		//int a = 2;
		//int b = 3;
		int c = a * b;
		System.out.println(c);
		
		return c;
	}
	
	public void test2(int a)
	{
	//	int a=3;
		int b;
		b = test1(5,6) * a;
		System.out.println("Return Pactice :" + b);
	}

}
