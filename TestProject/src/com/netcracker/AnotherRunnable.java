package com.netcracker;

public class AnotherRunnable implements Runnable{

	TestClass tc ;
	String name; 
	Resource rs;
	AnotherRunnable(TestClass tc, String name,Resource rs){
		
		
		this.tc = tc;
		this.name = name;
		this.rs = rs;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running: " + this.name);
		for (int i = 0 ; i < 100; i ++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tc.methodB("notifying");
		}
		
		for (int i = 1 ; i <= 1000; i++){
			try {
				//Thread.sleep(1000);
				
				tc.methodA(this.name, rs);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		System.out.println("Finished: " + this.name);
	}

}
