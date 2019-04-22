package pending.algorithms;

/*
Example:
Input
1
5 3
1 2 3 4 5

Output
3 2 1 5 4

Explanation:
Testcase 1: Reversing groups in size 3, first group consists of elements 1, 2, 3. Reversing this group, we have elements in order as 3, 2, 1.
*/
public class ReversingSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int sub = 4;
		int prev = 0;
		int[] result = new int[arr.length];

		for (int i = sub - 1; i < arr.length; i = i + sub) {

			int index = i;
			for (int x = prev; x <= i; x++) {

				result[x] = arr[index];
				index--;

			}
			prev = i + 1;

		}

		int loop = (arr.length - prev);
		int lastElemnt = arr.length - 1;

		while (loop > 0) {
			result[prev] = arr[lastElemnt];
			prev++;
			lastElemnt--;
			loop--;
		}

		for (int x = 0; x < result.length; x++) {

			System.out.print(result[x] + " ");

		}

	}

}
