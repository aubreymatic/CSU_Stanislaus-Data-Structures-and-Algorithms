package part3;

public class StanBankAccountDriver {

	public static void main(String[] args) {
		
		StanBankAccount account = new StanBankAccount(1);
		account.insertUserProfile("Danny", "Kim", "Stan State University");
		account.deposit(10000);
		account.withdraw(1000);
		System.out.println(account.getUserProfile());
		System.out.println(account.getBalance());
		
		StanBankAccount myAccount = new StanBankAccount(1320);
		myAccount.insertUserProfile("Chris", "Golpashin", "Stan State University");
		myAccount.deposit(100);
		myAccount.withdraw(25);
		System.out.println(myAccount.getUserProfile());
		System.out.println(myAccount.getBalance());
	}

}
