package com.netcracker;

public class ConflictClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConflictClass cc = new ConflictClass();
		Integer a = 1;
		Integer b = 2;

		System.out.println(cc.sum(a, b));

	}

	public int sum(int a, int b) {
		System.out.println("primitve method called");

		return a + b;
	}

	public Integer sum(Integer a, Integer b) {

		System.out.println("Integer method called");

		return a + b;
	}

}
