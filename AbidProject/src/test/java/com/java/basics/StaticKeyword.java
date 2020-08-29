package com.java.basics;

public class StaticKeyword {
	
	
	static int x=10;
	
	
	public StaticKeyword(){
		System.out.println(x++);
	}
	
	public static void m2(){
		System.out.println("222222");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new StaticKeyword();
		new StaticKeyword();
		new StaticKeyword();
		new StaticKeyword();
		
		
		StaticKeyword.m2();
		
		
		
		
		
	}

}
