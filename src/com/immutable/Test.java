package com.immutable;

final public class Test {
	private int i;

	public Test(int i) {
		//super();
		this.i = i;
	}
	
	public Test modify(int i) {     
		if(this.i==i) {
			return this;
			
		}else {
			return new Test(i);
		}
		
	}
	public static void main(String[] args) {
		Test t= new Test(10);
		Test t1=(Test)t.modify(10);
		System.out.println(t==t1);
		Test t2=(Test)t.modify(100);
		System.out.println(t==t2);
	}
	
	

}
