package kosa.oop2;

public class Main {

	public static void main(String[] args) {

//		Work => Study
		
		Work work = new Work();
		Study study = new Study();
		
		Person person = new Person("홍길동", work);
		
		person.doIt();

	}

}
