package com.netcracker;

public class ThreadTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource rs = new Resource();
		
		
		
		TestClass testClass = new TestClass();
	

		Thread t1 = new Thread(new RunnableClass(testClass, "Pavan",rs));

		Thread t2 = new Thread(new AnotherRunnable(testClass, "Supriya",rs));
		t1.start();
		t2.start();



	}

}
