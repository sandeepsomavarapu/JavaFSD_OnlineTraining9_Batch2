package com.ot9.collections;

import java.util.ArrayList;
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

	}

}
