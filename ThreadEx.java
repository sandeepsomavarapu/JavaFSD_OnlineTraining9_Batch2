package com.ot9.threds;

public class ThreadEx implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Created");
	}

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();

		Thread thread = new Thread(obj);
		thread.start();// --->run

	}

}
