import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FancyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "123456789";

		int[] inum = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			inum[i] = num.charAt(i);

		}

		if (checkConsecutive(inum) || checkSequential(inum) || checkFourDuplicate(inum)) {
			System.out.println("It is a fancy number " + num);
		}else
		{
			System.out.println("It is NOT a fancy number " + num);
		}
	}

	public static boolean checkConsecutive(int[] number) {
		int count = 0;
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] == number[i + 1]) {
				// System.out.println(number[i] + " " + number[i+1] );
				count++;
				if (count >= 2)
					return true;
			} else {
				count = 0;
			}

		}
		return false;
	}

	public static boolean checkSequential(int[] number) {
		int count = 0;
		for (int i = 0; i < number.length - 1; i++) {
			if ((number[i] + 1) == number[i + 1]) {
				count++;
				if (count >= 2)
					return true;
			}

		}
		return false;
	}

	public static boolean checkFourDuplicate(int[] number) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < number.length - 1; i++) {

			hm.put(number[i], 0);
			// System.out.println(hm.get(number[i]));

		}

		for (int i = 0; i < number.length - 1; i++) {

			if (hm.containsKey(number[i])) {
				hm.put(number[i], hm.get(number[i]) + 1);
			}
			// System.out.println(hm.get(number[i]));

		}
		for (Entry<Integer, Integer> o : hm.entrySet()) {

			if (o.getValue() >= 4) {
				return true;
			}

			// System.out.println("key: " + o.getKey() + " value: "
			// +o.getValue() );
		}

		return false;
	}

	public static boolean isTenDigit(int[] number) {

		if (number.length == 10)
			return true;
		else
			return false;

	}
}
