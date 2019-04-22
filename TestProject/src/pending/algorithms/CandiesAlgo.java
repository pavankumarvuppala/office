package pending.algorithms;

/*Distribute N candies among K people
Given N candies and K people. In the first turn, the first person gets 1 candy, the second gets 2 candies, and so on till K people. In the next turn, the first person gets K+1 candies, the second person gets k+2 candies and so on. If the number of candies is less than the required number of candies at every turn, then the person receives the remaining number of candies.

The task is to find the total number of candies every person has at the end.*/

public class CandiesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalCandies = 20;
		int headCount = 5;

		int[] personArr = new int[headCount];
		int index = 0;
		int candyInc = 1;

		while (totalCandies > 0) {

			if (index == headCount) {
				index = 0;
			}

			if (totalCandies < candyInc) {

				personArr[index] = personArr[index] + totalCandies;

			} else {

				personArr[index] = personArr[index] + candyInc;
			}
			totalCandies = totalCandies - candyInc;
			candyInc++;
			index++;
		}

		for (int i = 0; i < personArr.length; i++) {

			System.out.println(personArr[i]);

		}

	}

}
