package com.java.oops;

public class Sample1 extends Sample2 {
	
	public void m1(){
		System.out.println("11111111111");
	}
	
	public void m2(){
		System.out.println("22222");
	}
	
	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		obj.m1();
		obj.m2();
		
		obj.m3();
		obj.m8();
	}
	
	
	
}
