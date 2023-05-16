package com.ot9.collections;

import java.util.TreeSet;

//1)both homogeneous and haterogeneous data is allowed 
//2)not fixed in size , growable in nature 
//3)lots utility methods
//
//Set
//1)Duplicates are not allowed 
//2)insertion order is not preserved 
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("suresh");
		al.add("akash");
		al.add("hemanth");
		al.add("nani");
		al.add("bunny");
		al.add("mahesh");
		al.add("suresh");
		System.out.println(al);
	}

}
