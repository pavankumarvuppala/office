package questions.from.geekforgeeks.optimization;

public class MinimumDistance {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 1, 6, 0, 7, 2, 3 };

		int x = 3, y = 2;
		int left = 0, right = 0;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				position = i;
				break;
			}
		}

		for (int j = position; j >= 0; j--) {

			if (arr[j] == y && j != position) {
				
				left = (position - j);
				break;
			}
		}

		for (int k = position ; k < arr.length  ; k++) {

			if (arr[k] == y && k != position) {
				
				right = (k - position);
				break;
			}
		}
		System.out.println("Min distance between " + x + " and " + y + " is " + right);
		
	}
}
