package com.shallowcloning;

public class Dog implements Cloneable{
	private int j;
	Cat c;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	public Dog(Cat c, int j) {
		this.c=c;
		this.j=j;
	}
	public static void main(String[] args)throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d1= new Dog(c, 10);
		Dog d2=(Dog)d1.clone();
		d1.c.i=40;
		d1.j=30;
		System.out.println(d1.c.i+"---"+d1.j);
		System.out.println(d2.c.i+"---"+d2.j);
		
		
		
	}

}
