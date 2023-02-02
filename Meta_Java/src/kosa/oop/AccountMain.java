package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account("1111-1111", "한예찬", 1000);
		Account account2 = new Account("2222-2222", "한예찬1", 5000);
		
		account2.setBalance(50000);
		account2.withdraw(3000);
		account2.printAccount();
	}

}
