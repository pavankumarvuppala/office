
public class ExceptionTest {
	public static void main(String[] args) {

		try {

			int a = 0, b = 2;
			int c = b / a;

			int x = 0, y = 2;
			int z = y / x;

		} catch (ArithmeticException ae) {

			System.out.println("b/a is performed");

		} catch (ArithmeticException ae) {

			System.out.println("y/x is performed");

		}

	}
}
