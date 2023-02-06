package kosa.lamda;

public class LamdaExam {

	public static void main(String[] args) {
		// MyType => 익명 내부클래스로 구현하시오.

		MyType mt1 = new MyType() {

			@Override
			public void lamda() {
				System.out.println("익명 클래스 형식 입니다.");

			}

		};
		mt1.lamda();
		
		//람다식으로 구현
		MyType mt2 = () -> {
			System.out.println("람다식 형식 입니다.");
		};
		mt2.lamda();
		
		MyType my3 = () -> System.out.println("향상된 람다식");
		my3.lamda();
		
		YourType you1 = (String message) -> {
			System.out.println("메시지: " + message);
		};
		
		you1.lamda("안녕");
		
		YourType you2 = message -> System.out.println("메시지: " + message);
		you2.lamda("hello");
		
		//MyNumber getMax 구현 
		
		MyNumber mn1 = (number1, number2) -> (number1>number2) ? number1 : number2;
			
		System.out.println(mn1.getMax(2001, 2000));
		
		//Runnable => 람다식(1~10) 출력
		
		Runnable r = () -> {
			for(int i=1;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}
