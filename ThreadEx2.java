package com.ot9.threds;

public class ThreadEx2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		
		
		ThreadEx2 obj = new ThreadEx2();
			obj.start();
			
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Main Thread");//thread schedular 
			}
	}

}
