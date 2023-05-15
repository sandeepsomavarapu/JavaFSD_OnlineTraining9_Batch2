package com.ot9.threds;

public class ThreadEx2 extends Thread {

	@Override
	public void run() {// running
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("ibm");
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		ThreadEx2 obj = new ThreadEx2();// new /start
		obj.start(); // runnable

		Thread t1 = Thread.currentThread();
//			System.out.println(t1.getName());
//			System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		t1.setName("ot9");
		t1.setPriority(10);
		System.out.println(Thread.currentThread());

		for (int i = 0; i < 10; i++) {

			System.out.println("Main Thread");// thread schedular
		}
	}

}
