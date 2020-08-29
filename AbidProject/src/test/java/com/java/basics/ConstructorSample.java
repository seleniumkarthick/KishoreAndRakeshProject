package com.java.basics;

public class ConstructorSample {

	/*
	 * 
	 * classname and method name should be same
	 * it will not have return type
	 * no need to create object for calling constructor
	 * It will before all the methods
	 */
	
	public ConstructorSample(){
		System.out.println("111111");
	}
	
	public void m1(){
		System.out.println("2222");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorSample obj=new ConstructorSample();
		obj.m1();
		
	}

}
