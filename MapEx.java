package com.ot9.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {

		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(123, "sandeep");
		emps.put(1322, "mahesh");
		emps.put(121, "suresh");
		emps.put(433, "akash");
		emps.put(8989, "babu");
		emps.put(123, "charan");
		System.out.println(emps);

		Set<Integer> set = emps.keySet();

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " " + emps.get(key));
		}
		
		
		
		
		
		
		
		

//		TreeMap<Integer, String> emps1 = new TreeMap<Integer, String>();
//		emps1.putAll(emps);
//		System.out.println(emps1);
//		System.out.println(emps1.get(123));
//		System.out.println(emps1.remove(123));
//		System.out.println(emps1);
//		System.out.println(emps1.containsKey(123));
//		System.out.println(emps1.containsValue("babu"));

	}
}
