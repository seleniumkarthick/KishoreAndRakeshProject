package com.java.collections;

import java.util.*;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List
		 * 		ArrayList
		 * 		LinkedList
		 * Set
		 * Map
		 * 
		 */
		
		List x=new ArrayList();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.remove(2);
		x.add(4, 300);
		x.get(2);

		System.out.println(x.get(2));
		
		
		List y=new LinkedList();
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(50);
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(50);

		System.out.println(y.size());
		
		Set x1=new HashSet();
		x1.add(10);
		x1.add(20);
		x1.add(30);
		x1.add(40);
		x1.add(50);
		x1.add(60);
		x1.add(70);
		x1.add(10);
		x1.add(20);
		x1.add(30);
		x1.add(40);
		x1.add(50);
		x1.add(60);
		x1.add(70);
		System.out.println(x1);
		
		Map z1=new HashMap();
		z1.put("ram age", 10);
		z1.put("sam age", 20);
		z1.put("kumar age", 30);
		
		System.out.println(z1);
		
		System.out.println(z1.get("sam age"));
		System.out.println(z1.get("ram age"));
		System.out.println(z1.get("kumar age"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
