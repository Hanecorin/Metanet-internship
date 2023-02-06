package kosa.oop;

public class Account {
	//계좌 객체
	//상태(필드) : 계좌번호, 계좌주, 잔액 => 멤버변수
	//기능(메서드) : 입금하다, 출금하다,
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account() {} // 디폴트 생성자
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	
	
	public void deposit(int amount) {
		balance += amount;
		
	}
	
	public int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액부족");
		}
		balance -= amount;
		
		return amount;
	}
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("이름: " + ownerName);
		System.out.println("잔액: " + balance);
		
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
