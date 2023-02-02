package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.전화번호추가 2.출력 3.검색 4.종료
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.println("메뉴: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case"1":
				m.add();
				break;
			case"2":
				m.listPhoneInfo();
				break;
			case"3":
				m.search();
				break;
			case"4":
				break;
			}
		}
	}

}
