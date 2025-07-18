public class Encapsulation {
// Encapsulation is concept of wrapping data and methods
//into a single unit and hiding internal details  to outsiders.

	private double balance;
	private int accountNumber;

	
	//setter1
	public void setAcc(int num) {
		if(num != 0 && String.valueOf(num).length()>=6) {
			System.out.println("Number Valid");
		}
		else {
			System.out.println("Check the Number");
		}
	}
	//setter2
	public void setBalance(double amount) {
		if(amount > 0) {
			balance = amount;
		}
		else {
			System.out.println("Credit some amount");
		}
	}
	//setter3
	public void setdeposit(double money) {
		balance += money;
		if(money > 0) {
			System.out.println("Your current balance : " + money);
		}
		else {
			System.out.println("If you want deposit the amout it should be greater than 0");
		}
	}
	
	// setter4
	public void withdraw(double amount) {
		balance -= amount;
		if(amount >0 && amount <= balance) {
			System.out.println("Withdrawn: " + amount);
		}
		else {
			System.out.println("Enter valid Input");
		}
	}
	//getter1
	public double getBalance() 
	{
		return balance;
	}
	//getter2
	public int getAccountNum() {
		return accountNumber;
	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		e.setAcc(1234567);
		e.setdeposit(10000);
		System.out.println("Intial balance: " + e.getBalance());
		
		e.setdeposit(12);
		System.out.println("After deposit: " + e.getBalance());
		
		e.withdraw(2);
		System.out.println("After withdraw: " + e.getBalance());
		
		//e.withdraw(2000);
		
		System.out.println("Final balance: " + e.getBalance());
		System.out.println("Account Number: " + e.getAccountNum());
		
		
	}
}
