
public class ThreadAttempt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		UserRunnable t1 = new UserRunnable();
		UserRunnable t2 = new UserRunnable();
		t1.start();
		//Thread.sleep(0);
		t2.start();
	}
}



class UserRunnable implements Runnable {

	private String threadName;
	private Thread t;

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		synchronized(t){
		for (int i = 1; i < 10; i++) {
			System.out.println(this.threadName + " executing "+ i + " iteration " );
		}
		System.out.println(" Exiting  "+ t.getName());
		}
	}

	 public void start() {
		if (t == null) {
			t = new Thread(this);
		}
		displayThreadInfo();
		
		this.threadName = t.getName();
		t.start();
		
	}

	 private void displayThreadInfo() {
		System.out.println("Thread  " + t.getName() + " is starting");
		// TODO Auto-generated method stub
		
	}
}
