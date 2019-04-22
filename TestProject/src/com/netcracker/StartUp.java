package com.netcracker;

import java.util.ArrayList;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			a.add(i);

		}
		
		System.out.println(a);

		for (int i = 0; i < 10; i++) {

			a.remove(i);

		}

		
		System.out.println(a);
	}

}
