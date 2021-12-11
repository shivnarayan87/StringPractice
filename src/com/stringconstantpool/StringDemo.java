package com.stringconstantpool;

public class StringDemo {
	public static void main(String[] args) {
		String s= new String("durga");
		String s1="durga";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s2="durga";
		System.out.println(s1==s2);
		String s3=s.intern();
		System.out.println(s3.toString());
		System.out.println(s3==s1);
		System.out.println(s3==s);
		
		
		
	}
	
	

}
