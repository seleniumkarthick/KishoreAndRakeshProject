package com.java.oops;

public class Poly2 {
	
	
	public void m1(){
		System.out.println("poly 11111");
		System.out.println("poly 11111");
		System.out.println("poly 11111");
		System.out.println("poly 11111");
	}
	
	public void m1(int x){
		System.out.println("poly 22222222");
		System.out.println("poly 22222222");
		System.out.println("poly 22222222");
		System.out.println("poly 22222222");
		System.out.println("poly 22222222");
	}
	
	public void m1(boolean x){
		System.out.println("poly 44444");
		System.out.println("poly 44444");
		System.out.println("poly 44444");
		System.out.println("poly 44444");
	}
	
	
	public void m1(int x,int y){
		System.out.println("poly 3333333");
		System.out.println("poly 3333333");
		System.out.println("poly 3333333");
		System.out.println("poly 3333333");
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
