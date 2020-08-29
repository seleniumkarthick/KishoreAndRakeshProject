package com.java.basics;

public class ClassMethodObject {

	public void m1(){
		System.out.println("1111111111");
	}
	
	public void m2(int x,int y){
		int z=x+y;
		System.out.println(z);
	}
	
	public int m3(){
		int z=30+40;
		return z;
	}
	
	public static void main(String[] args){
		
		//classname obj=new classname
		ClassMethodObject obj=new ClassMethodObject();
		obj.m1();
		
		obj.m2(10, 20);
		
		obj.m2(130, 20);
		
		obj.m2(10, 240);
		
		obj.m2(110, 220);
		
		int x1=obj.m3();
		System.out.println(x1);
		
		System.out.println("hai");
	}
	
	
}
