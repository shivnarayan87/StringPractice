package com.synchronization;

public class MyThread extends Thread{
	MyWish mw;
	String i;
	public MyThread(MyWish mw, String i) {
		//super();
		this.mw = mw;
		this.i = i;
	}
	public void run() {
		mw.wish(i);
	}
	
	


}
