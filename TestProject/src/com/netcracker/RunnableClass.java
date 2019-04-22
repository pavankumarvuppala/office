package com.netcracker;

public class RunnableClass implements Runnable {

	TestClass ts ;
	String name ;
	Resource rs ;
	RunnableClass (TestClass ts, String name,Resource rs ){
		
		this.ts = ts;
		this.name = name;
		this.rs = rs;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running: " + this.name);
		
		
		try {
			for (int i = 1 ; i <= 1000; i++){
				//Thread.sleep(1000);
			ts.methodA(this.name, rs);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("Finished: " + this.name);
	}
	
	

}
