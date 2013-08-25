package com.patch.selenium.test;

import com.patch.selenium.common.ReusableMethods;
import com.patch.selenium.common.SecuresMethods;
import com.patch.selenium.support.ReturnPractice;
import com.patch.selenium.support.SupportMethods;

public class SeleniumTest extends SupportMethods
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addition(2, 7);
		
		ReusableMethods obj1 = new ReusableMethods();
		obj1.multiply(10, 30);
		
		division(6, 3);
		
		subtraction(6, 3);
		
		ReturnPractice rp = new ReturnPractice();
		rp.test2(7);	
		
		//SecuresMethods sm = new SecuresMethods();
		//sm.constructorExample();
		
		SecuresMethods sm = new SecuresMethods(2,3);
		sm.constructorExample();
		
		SecuresMethods sm2 = new SecuresMethods(5,6,8);
		sm2.constructorExample2();
	}
	static void addition(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition:" + c);
	}
}
