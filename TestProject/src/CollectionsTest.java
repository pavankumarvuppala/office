import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CollectionsTest {
/*static {
	
	System.out.println("STatic block");
	BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
	try {
		String eLine = bf.readLine();
		System.out.println(eLine);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
//}
	public static void main(String[] args) {

		String[] myArray = { "hello", "hi" };

		List<String> list = new ArrayList<String>();
		list = Arrays.asList(myArray);
		list = new ArrayList<String>();

		list = Arrays.asList(myArray);

		for (String a : list) {
			System.out.println("Array list items " + a);

		}

		Integer i = new Integer(1);
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee();
		empList.add(e1);

		HashSet hs = new HashSet();
		TreeSet ts = new TreeSet();

		hs.add(null);
		hs.add("hello");
		hs.add(1);
		ts.add(null);
		
		List list2 = new ArrayList();
		list2.add(null);
		list2.add("hello");
		list2.add(2);
		// ts.add(null);

	}

}

class Employee {

	int age;
}
