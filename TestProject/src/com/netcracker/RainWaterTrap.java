package com.netcracker;

public class RainWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 0, 1, 0, 1, 0, 2, 1, 3, 1, 0 };

//		int[] leftArr = getArray("left", arr);
	//	int[] rightArr = getArray("right", arr);
		
		System.out.println(findMaxIndex(arr));
/*
		for (int i  = 0;i < leftArr.length;i ++){
			
			System.out.println(leftArr[i]);
			
		}*/
		

	}

	private static int[] getArray(String string, int[] arr) {
		// TODO Auto-generated method stub

		int maxIndex = findMaxIndex(arr);

		if (string.equals("left")) {

			int[] leftArray = new int[maxIndex + 1];

			for (int i = 0; i <= maxIndex; i++) {

				leftArray[i] = arr[i];

			}

			return leftArray;

		}

		if (string.equals("right")) {

			int[] rightArray = new int[arr.length - maxIndex];

			for (int i = maxIndex; i < arr.length; i++) {

				rightArray[i] = arr[i];

			}

			return rightArray;
		}
		
		
		return null;

	}

	private static int findMaxIndex(int[] arr) {
		// TODO Auto-generated method stub

		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[maxIndex] < arr[i])
				maxIndex = i;

		}
		return maxIndex;
	}

}
