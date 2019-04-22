import java.util.Collections;
import java.util.concurrent.SynchronousQueue;

public class MainClass {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.setName("Pavan");
		s1.setRollno(1);
		s2.setName("Kumar");
		s2.setRollno(2);
		s3.setName("Vuppala");
		s3.setRollno(3);
		Student[] studentArray = new Student[3];
		studentArray[0] =  s1;
		studentArray[1] =  s2;
		studentArray[2] =  s3;
		
		
		for (int i=0;i<studentArray.length;i++){
			
			System.out.println(studentArray[i].getName());
		}
		//Collections.sort(studentArray);
		

		int mainArr_1[] = { 3, 2, 1, 56, 10000, 167 };
		int mainArr_2[] = { 3, 345, 234, 21, 56789 };
		int mainArr_3[] = { 1, 2, 3, 4, 8, 10 };
		
		 int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5, 9,9,9}; 
	     int n = arr.length; 

		// findMaxAndMin(mainArr_1);
		// findMaxAndMin(mainArr_2);
		// bubbleSort(mainArr_1);
		// reverseArry(mainArr_3);

		//rotateArry(mainArr_3, 6);
	//	removeDups(arr,n);
	}

	
	
	
	private static void removeDups(int[] arr, int n) {
		
		int [] temp = new int[n];
		
		int j = 0;
		int last = arr[n - 1];
	 for (int i = 0; i < n - 1 ;i ++){
		 
		 if (arr [i] != arr [i+1]){
			 
			 temp[j] = arr [i];
			 j++; 
		 }
		 
		 
	 }
	 temp [j ] = last;
	 System.out.println("Size of temp: " + temp.length);
	 
	 for (int i=0; i<temp.length;i++){
		 
		 
		 arr[i] = temp[i];
	 }
	 
	 
		System.out.println("removed duplicates");
		for (int x = 0; x < arr.length; x++) {

			System.out.print(arr[x] + " ");

		}

		// TODO Auto-generated method stub
		
	}




	static int removeDuplicates(int arr[], int n) 
    { 
        // Return, if array is empty 
        // or contains a single element 
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<n-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = arr[n-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    } 
	
	
	public static void rotateArry(int arr[], int n) {

		int count = n;
		while (n > 0) {
			int lst = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				
				arr[i] = arr[i - 1];
			}
			arr[0] = lst;
			n--;
		}

		System.out.println("Rotation of arry done by " + count + " times");
		for (int x = 0; x < arr.length; x++) {

			System.out.print(arr[x] + " ");

		}

	}

	public static void reverseArry(int arr[]) {

		int temp;

		for (int i = 0; i < arr.length / 2; i++) {

			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			System.out.println("end point: " + (arr.length - 1 - i));

			// if (i < arr.length/2 ){
			arr[(arr.length - 1 - i)] = temp;

			// }

		}

		System.out.println("Reverse of arra : ");
		for (int x = 0; x < arr.length; x++) {

			System.out.print(arr[x] + " ");

		}
	}

	public static void bubbleSort(int arr[]) {

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < (arr.length - 1 - i); j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

		System.out.println("Sorted Arry: ");
		for (int j : arr) {

			System.out.print(j + " ");

		}

	}

	public static void findMaxAndMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];

		}
		System.out.println("Max : " + max + " Min: " + min);

	}

}
