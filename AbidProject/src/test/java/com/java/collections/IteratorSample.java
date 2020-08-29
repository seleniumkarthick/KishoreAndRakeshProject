package com.java.collections;

import java.util.*;

public class IteratorSample {
	
	public static void main(String[] args) {
		
		List x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		
		/*
		 * next - it will travel to next element
		 * hasNext - it will check the next element. If there is the element it will return true, else false
		 * 
		 */
		Iterator itr=x.iterator();
		
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
	

}
