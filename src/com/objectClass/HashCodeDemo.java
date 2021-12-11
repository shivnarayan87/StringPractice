package com.objectClass;

// in this class we have to try override hascode and toString method based on our requirement
public class HashCodeDemo {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public HashCodeDemo(int i) {
		//super();
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return String.valueOf(hashCode());
	}
	
	public static void main(String[] args) {
		HashCodeDemo demo= new HashCodeDemo(10);
		HashCodeDemo demo1= new HashCodeDemo(100);
		System.out.println(demo.toString());
		System.out.println(demo1.toString());
	}
	
	

}
