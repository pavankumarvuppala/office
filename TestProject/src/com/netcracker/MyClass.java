package com.netcracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		String s1 = new String ("Pavan");  // Creates in both heap and constant pool
		String s3 = new String ("Pavan");
		
		
		String s2 = "Pavan";
		String s7 = "Pavan"; // refers to Pavan in pool
		
		s2 += "mkmk";
		
		

	
		
		s1.equals(paramObject)
		
		String s4 = s3.intern();
		
		String s5 = s2;
		String s6 = s3;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		
	}
	
		
		
	}


