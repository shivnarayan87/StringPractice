package com.objectClass;

public class Student {
	private String sname;
	private int rollno;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String sname, int rollno) {
		//super();
		this.sname = sname;
		this.rollno = rollno;
	}
	public String toString() {
		return "name:"+sname+"::"+"roll:"+rollno;
	}
	public static void main(String[] args) {
		Student s= new Student("shiv", new Integer(12));
		Student s1= new Student("shivkr", new Integer(14));
		System.out.println(s);
		System.out.println(s.toString());
		String s2= new String("ramu");
		String s3= new String("ramu");
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
	}
	

}
