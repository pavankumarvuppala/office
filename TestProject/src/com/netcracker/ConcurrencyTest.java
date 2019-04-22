package com.netcracker;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ConcurrencyTest {

	
	public static void main(String[] args) {
		
		
		   ConcurrentHashMap m = new ConcurrentHashMap(); 
	        m.put(100, "Hello"); 
	        m.put(101, "Geeks"); 
	        m.put(102, "Geeks"); 
	  
	        // Here we cant add Hello because 101 key 
	        // is already present in ConcurrentHashMap object 
	      //  m.putIfAbsent(101, "Hello"); 
	  
	        // We can remove entry because 101 key 
	        // is associated with For value 
	      //  m.remove(101, "Geeks"); 
	  
	        // Now we can add Hello 
	     //   m.putIfAbsent(103, "Hello"); 
	  
	        // We cant replace Hello with For 
	     //   m.replace(101, "Hello", "For"); 
	        KeySetView k = m.keySet();
	        
	        Iterator<Integer> it = k.iterator();
	        
	       while(it.hasNext()){
	        	
	        	System.out.println(it.next());
	        	
	        }
	   
	   
	}
}
