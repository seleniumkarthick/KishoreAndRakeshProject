package com.java.basics;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		try{
			int x=10/0;
			System.out.println(x);
		}catch(Exception x){
			x.printStackTrace();
		}*/
		
		System.out.println("hai");
		
		try{
			int x=10/0;
			System.out.println(x);
		}catch(Exception x){
			x.printStackTrace();
		}finally{
			System.out.println("hello");
		}
		
		
		System.out.println("hai");
		
	}

}
