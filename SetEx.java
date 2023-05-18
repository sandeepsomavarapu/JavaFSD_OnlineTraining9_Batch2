package com.ot9.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1)both homogeneous and heterogeneous data is allowed 
//2)not fixed in size , growable in nature 
//3)lots utility methods
//
//Set
//1)Duplicates are not allowed 
//2)insertion order is not preserved 
public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>(new MyOrder());
		al.add("suresh");
		al.add("akash");
		al.add("hemanth");
		al.add("nani");
		al.add("bunny");
		al.add("mahesh");
		al.add("suresh");
		System.out.println(al);// order

	}

}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}