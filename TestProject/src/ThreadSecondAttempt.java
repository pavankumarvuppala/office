
public class ThreadSecondAttempt {
	
	
	public static void main (String [] a){
	
	Bank b = new Bank();
	Account a1 = new Account();
	Account a2 = new Account();
	Account a3 = new Account();
	a1.setAccountNumber(1);
	a2.setAccountNumber(2);
	a3.setAccountNumber(3);
	System.out.println("Total number of Accounts : " + b.gettotalAccounts());
	
	}
	
}






class Bank {
	
	static int totalAccounts = 0;
	
	public void settotalAccounts(int total){
		this.totalAccounts = total;
	}
	
	public int gettotalAccounts(){
		return this.totalAccounts ;
	}
}

class Account {
	
	private int balance;
	private int accountNumber;
	Bank b = new Bank();
	public int getAccountNumber(){

		return this.accountNumber;
	}
	
	public void setAccountNumber(int acctNum){
		b.settotalAccounts(b.gettotalAccounts() + 1);
		this.accountNumber = acctNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}