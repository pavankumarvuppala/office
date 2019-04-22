package questions.from.geekforgeeks.optimization;

import java.util.ArrayList;

public class SubStringWithoutDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "oracleapps";
		ArrayList<String> sArry = new ArrayList<String>();

		char[] c = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);

		}

		for (int j = 0; j < c.length; j++) {

			StringBuffer sb = new StringBuffer();
			for (int i = j; i < c.length; i++) {

				if (sb.toString().contains(c[i] + "")) {

					break;

				} else {
					sb.append(c[i]);
				}

			}
			sArry.add(sb.toString());

		}
		String max = "";
		for (String sa : sArry) {

			if (sa.length() > max.length())
				max = sa;

		}
		System.out.println("Max Subsequece:" + max);
	}

}
