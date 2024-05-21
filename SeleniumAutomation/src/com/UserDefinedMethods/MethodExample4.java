package com.UserDefinedMethods;

import com.OrangeHRMApplication.UserdefinedMethods;

public class MethodExample4 {
	public static void main(String[] args) {
		UserdefinedMethods user=new UserdefinedMethods();
		user.number();
		MethodExample4 m4=new MethodExample4();
		m4.Sub();
		
	}
	void Sub()
	{
		int a=89;
		int b=79;
		int c;
		c=a-b;
		System.out.println("the substraction of a-b is:"+c);
		
		}
	}


