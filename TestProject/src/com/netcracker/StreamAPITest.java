package com.netcracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest implements Callable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		//Stream stream = arr.stream();
	
		List<Integer> number = Arrays.asList(5,6,3,1,2,8); 
		List<Integer> square = number.stream().map(x -> x*x ).collect(Collectors.toList());
	
		List<Integer> show =   number.stream().sorted().collect(Collectors.toList()); 
		number.stream().filter(x->(x % 2) == 0).forEach(x-> System.out.println(x*x));
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});

		executorService.shutdown();
		
	//	System.out.println(square);
		//System.out.println(predicate);
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
