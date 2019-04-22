package newpackage;

public class SubSequence {

	public static void main(String args[]) {
		// Sorted subsequence of size 3
		int[] arr = { 1,6,3,1,2,4,5,3,7,8};
		int index = 0;
		int n = arr.length;
		int min = 0;
		int[] subarr = new int[3];

		for (int j = 0; j < n; j++) {
			index = 0;
			min = j;
			for (int i = j + 1; i < n; i++) {

				if ((arr[min] + 1) == arr[i]) {

					subarr[index] = arr[min];
					min = i;
					index++;

				}
				if (index == 2) {
					subarr[index] = arr[min];
					for (int x = 0; x <= index; x++) {
						System.out.print(subarr[x] + " ");

					}
					break;

				}

			}

			System.out.println();

		}

	}

}
