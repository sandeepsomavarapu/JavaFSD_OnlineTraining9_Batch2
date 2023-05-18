package com.ot9.collections;

import java.util.ArrayList;
import java.util.Iterator;
//1)both homogeneous and haterogeneous data is allowed 
//2)not fixed in size , growable in nature 
//3)lots utility methods
//List
//1)Duplicates are allowed 
//2)insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("suresh");
		al.add("akash");
		al.add("hemanth");
		al.add("nani");
		al.add("bunny");
		al.add("mahesh");
		al.add("suresh");

		System.out.println(al);

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			if (name.endsWith("sh"))
				System.out.println(name);
		}

//		//al.remove("hemanth");
//		al.remove(2);
//		System.out.println(al.contains("sandeep"));
//		System.out.println(al);
//		ArrayList<String> al1 = new ArrayList<String>();
//		al1.add("sandeep");
//		al1.add("ram");
//		System.out.println(al1);
//		al1.addAll(al);
//		System.out.println(al1.containsAll(al));
//		//al1.removeAll(al);
//		//al1.retainAll(al);
//		System.out.println(al1);

	}

}
