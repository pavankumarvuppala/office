package questions.from.geekforgeeks.optimization;

public class LargestSumContigous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] arr = { 4,6,-7,100,-4,8,-4,1 };
		int sum = 0;
		int highest = 0, start = 0 , end = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 0) {

				for (int j = i ; j < arr.length; j++) {

					sum = sum + arr[j];
					if (highest < sum){
						highest = sum;
						start = i;
						end = j ;
					}
					for (int k = i; k <= j; k++) {

					//	System.out.print("{" + arr[k] + "} ");
					}
				//	System.out.println("from index : " + i + " to " + j + " sum: " + sum);

					

				}
				

			}
			sum = 0;

		}

		
		System.out.println("Higest Value of sum is: " + highest + " from index : "+ start + " to "+ end);
	}

}
