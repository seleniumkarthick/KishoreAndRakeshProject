package com.java.oops;

public class Poly1 extends Poly2 {
	
	
	public void m1(){
		System.out.println("11111");
	}
	
	public void m1(int x){
		System.out.println("22222222");
	}
	
	public void m1(boolean x){
		System.out.println("44444");
	}

	
	public static void main(String[] args) {
		Poly1 obj=new Poly1();
		obj.m1();
		obj.m1(10);
		obj.m1(10,20);
		obj.m1(true);
		
		
		obj.assertEqual(10, 10);
		obj.assertEqual("hai", "hai");
		obj.assertEqual(true, false);
		
		
		Poly2 obj1=new Poly2();
		obj1.m1();
		obj1.m1(true);
		
	}

	

	
	public void m1(int x,int y){
		System.out.println("3333333");
	}
	
	
	public void assertEqual(String x,String y){
		if(x.equals(y)){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
	
	public void assertEqual(boolean x,boolean y){
		if(x==y){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
		
	public void assertEqual(int x,int y){
		if(x==y){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
	
	
}
