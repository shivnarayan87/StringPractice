package com.producerconsumer;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b= new ThreadB();
		//b.setPriority(10);
		b.start();
		synchronized (b) {
			
			try {
				b.wait();
				System.out.println("main thread got notification call");
				System.out.println(b.sum);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			
			
		}
	}

}
