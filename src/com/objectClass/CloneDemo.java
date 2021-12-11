package com.objectClass;

public class CloneDemo implements Cloneable {
	int i=10;
	int j=20;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneDemo cd = new CloneDemo();
		CloneDemo copy =(CloneDemo)cd.clone();
		//copy.i=888;
		//copy.j=999;
		
		System.out.println(copy.i+"----"+copy.j);
		
		System.out.println(cd.i+"---"+cd.j);
		
	}
	

}
