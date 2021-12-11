package com.shallowcloning;

public class DeepDog implements Cloneable{
	
	Cat c;
	int j;
	public DeepDog(Cat c, int j) {
		//super();
		this.c = c;
		this.j = j;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		Cat c1= new Cat(c.i);
		DeepDog d= new DeepDog(c1,this.j )	;
		return d;
	}
	
	public static void main(String[] args)throws CloneNotSupportedException {
	
		Cat c= new Cat(40);
		DeepDog dd= new DeepDog(c, 30);
		DeepDog dd1=(DeepDog)dd.clone();
		dd.c.i=60;
		System.out.println(dd.j+"---"+dd.c.i);
		System.out.println(dd1.j+"----"+dd1.c.i);
		
		
	}
	
	
	

}
