package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
//		Account account = new Account("1111-1111", "한예찬", 1000);
//		Account account2 = new Account("2222-2222", "한예찬1", 5000);
//		
//		account2.setBalance(50000);
//		account2.withdraw(3000);
//		account2.printAccount();

//		CheckingAccount ca = new CheckingAccount("123-1211", "한예찬", 10000, "123-123");
//		try {
//			ca.pay("123-123",5000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally { //예외 발생 , 예외 발생 안해도 무조건 실행
//		
//		}
//		ca.printAccount();
		
		Account account = new MinusAccount("123-123","한예찬",5000,10000); 
		// 객체 생성시 부모의 클래스 이름을 사용하여도됨(형변환이 가능)
		// 클래스 타입을 형변환을 통해 같게 해야 같은 배열안에 담을수있고, 파라미터를 전해도 사용가능 0
		
		try {
			account.withdraw(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		account.printAccount();
		
	}

}
