package dbs.questions;

import java.util.HashMap;
import java.util.Map;

public class KeySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map hm = new HashMap();
		
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		hm.put(1,"A");
		
		String convert = "This the string";
		char[] c = convert.toCharArray();
		for (int i=0; i < c.length;i++){
			
			System.out.print(c[i]);
		}
		System.out.println(hm.size());
		
		for (Object name : hm.keySet()){
			
			System.out.println(name+ " " + hm.get(name));
		}
		

	}

}
