package com.producerconsumer;

public class ThreadB extends Thread {
	
	int sum=0;
	public void run() {
		synchronized (this) {
			for(int i=0; i<10;i++) {
				sum=sum+i;
			}
			System.out.println("child thread notify to consumer.");
			try {
				this.notify();
			} catch (IllegalMonitorStateException e) {
				// TODO: handle exception
			}
		
			
		}
	}

}
