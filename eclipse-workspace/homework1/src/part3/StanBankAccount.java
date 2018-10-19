package part3;

public class StanBankAccount extends BankAccount {
	
	private String firstName, lastName;
	private String address;
	private int accountNo;
	private double balance;
	
	public StanBankAccount(int accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public void insertUserProfile(String firstName,
			String lastName, String address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	@Override
	public String getUserProfile() {
		String userProfile = "";
		userProfile += firstName + " " + lastName + "\n";
		userProfile += address;
		return userProfile;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
}
