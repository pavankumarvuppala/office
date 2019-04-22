import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplicate {

	int dup;
	String check;
	public static void main(String[] args) {

		String main = "i am am learning java java java hello mister pavan kumar hello boss java do you know";
		String[] mainArry = main.split(" ");
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		Integer counter = new Integer(1);
		for (int i = 0; i < mainArry.length; i++) {

			if (countMap.containsKey(mainArry[i])) {
				counter = countMap.get(mainArry[i]);
				counter++;
			}
			countMap.put(mainArry[i], counter);
			counter = 1;
		}
		for (Entry<String, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}
