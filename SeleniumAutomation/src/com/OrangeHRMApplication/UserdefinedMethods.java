package com.OrangeHRMApplication;

import com.UserDefinedMethods.MethodExample1;

public class UserdefinedMethods {
	public void number()
	{
		int a=45;
		int b=78;
		int c;
		c=a+b;
		System.out.println("The addition of a & b is="+c);
	}
	public static void main(String[] args) {
		MethodExample1 m1=new MethodExample1();
		m1.heena();
		//m1.zain-is protected
		//m1.patel-private
		UserdefinedMethods user=new UserdefinedMethods();
		user.number();
		
	}

}
