package com.ot9.strings;

public class StringEx {

	public static void main(String[] args) {

		String name = "onlinetraining9"; // imuttable
		String name1 = "onlinetraining9";

		System.out.println(name == name1);//true
		System.out.println(name.equals(name1));//true
		System.out.println(name.compareTo(name1));//0
		
		String name2 = new String("onlinetraining9"); // imuttable
		String name3 = new String("onlinetraining9");
		
		System.out.println(name2 == name3);//false
		System.out.println(name2.equals(name3));//true
		
		
		StringBuffer name4 = new StringBuffer("onlinetraining9"); //muttable
		
					name4.append(" hyderabad");
					
					System.out.println(name4);
		
		StringBuffer name5 = new StringBuffer("onlinetraining9");
		
		
		System.out.println(name4 == name5);//false
		System.out.println(name4.equals(name5));//false Object .equals == reference
		
		
		
		
		

//		System.out.println(name.concat(" hyderabad"));//GC
//		System.out.println(name);

	}

}
