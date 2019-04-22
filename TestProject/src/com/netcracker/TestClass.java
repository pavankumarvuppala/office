package com.netcracker;

import java.util.ArrayList;

public class TestClass {

	ArrayList <String> al = new ArrayList<>();
	
	
	 synchronized public void methodA(String t, Resource rs) throws InterruptedException {
	
		System.out.println("Inside method A: Thread " + t);
		wait();
		rs.i++;
		System.out.println(rs.i);
		
	}

	synchronized public void methodB(String t) {

		System.out.println("Inside method B: Thread " + t);
		System.out.println("Notifying the another thread");
		notify();
	}
}
