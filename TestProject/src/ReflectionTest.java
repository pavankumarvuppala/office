import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionTest {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		OneDay one = new OneDay();
		Test t = new Test();
		ArrayList objList = new ArrayList();

		objList.add(one);
		objList.add(t);

		for (Object x : objList) {

			Class c = x.getClass();

			System.out.println("Cls name: " + c.getName());

			Method[] m = c.getDeclaredMethods();

		//	for (int i = 0; i < m.length; i++) {
				m[0].invoke(c.getClass(), null);
				//System.out.println(m[i].getName());

			//}

		}

	}

}

class OneDay {

	public void oneDayDisplay() {

		System.out.println("Displaying OneDay class method");
	}
}

class Test {

	public void testDisplay() {

		System.out.println("Displaying Test class method");
	}
}