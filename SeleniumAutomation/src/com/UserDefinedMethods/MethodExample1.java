package com.UserDefinedMethods;

public class MethodExample1 {
	public void heena() //need not to be same package same class for accessing in another class
	{
		System.out.println("Heena patel");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Abbbu");
		System.out.println();

	MethodExample1 m1=new MethodExample1();
	m1.heena();
	m1.patel();
	m1.zain();
	}
	private void patel() //need same class & same package for accessing in another class
	{
		System.out.println("**********");
		System.out.println();
	}
	
	
	protected void zain() //need same package for accessing in another class
	{
	  System.out.println("Good morning");
	  System.out.println();
	}

}
