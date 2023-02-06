package kosa.oop;

public class MinusAccount extends Account {

	private int limit; // 마이너스 한도

	public MinusAccount() {
	}

	public MinusAccount(String accountNo, String ownerName, int balance, int limit) {
		super(accountNo, ownerName, balance);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public int withdraw(int amount)throws Exception{
		if(getBalance() + limit < amount) {
			throw new Exception("잔액부족");
		}
		int balance = getBalance();
		setBalance(balance - amount);
		return balance;
		
		
	}


}
