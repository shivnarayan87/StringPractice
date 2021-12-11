package com.synchronization;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyWish wish= new MyWish();
		MyThread t= new MyThread(wish, "yuvraj");
		MyThread t1= new MyThread(wish, "Dhoni");
		//t.setPriority(10);
		t.start();
		//t1.setPriority(10);
		t1.start();
	}

}
