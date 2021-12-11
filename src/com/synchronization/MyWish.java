package com.synchronization;

public class MyWish {
	public synchronized void wish(String wish) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Good morning:"+wish);
			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}

}
