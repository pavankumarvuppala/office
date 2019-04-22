package datastructures;

public class CustomStackImpl {
	static { 
        int i = 10; 
        CustomStackImpl.display();
        System.out.println("Static block called"); 
        System.exit(0);
    } 

	public static void main(String args[]) {

		CustomStackImpl stack = new CustomStackImpl();

		stack.push(1);
		stack.push(6);
		stack.push(9);
		stack.pop();
		System.out.println(stack.isEmpty());

		stack.peek();

	}

	int top = -1;

	int size;

	private int[] arr;

	CustomStackImpl() {

		this.size = 50;
		this.arr = new int[size];
		
	        System.out.println("Constructor called"); 
	    

	}
	
	public static void display(){
		
		System.out.println("Display called");
	}

	public int pop() {
		int value = 0;
		if (this.top == -1) {

			System.out.println("Empty stack ");
			return -1;
		} else {
			value = arr[this.top];
			this.top--;
			return value;

		}

	}

	public void push(int val) {

		this.top++;
		arr[this.top] = val;

	}

	public boolean isEmpty() {

		if (this.top == -1) {

			return true;
		} else {

			return false;
		}

	}

	public void peek() {

		System.out.println(arr[this.top]);
	}
}
