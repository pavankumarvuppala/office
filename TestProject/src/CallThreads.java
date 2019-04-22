
public class CallThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	FirstThread f1= new FirstThread();
	Thread t1 = new Thread(f1);
	t1.start();
	
	
	SecondThread s = new SecondThread();
	s.start();
	SecondThread s2 = new SecondThread();
	s2.start();
	
	}


    
	
}
