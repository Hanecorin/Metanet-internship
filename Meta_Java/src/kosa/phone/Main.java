package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.전화번호추가 2.출력 3.검색 4.종료
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.println("메뉴: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case"1":
//				System.out.println("1.추가등록안함 2.추가등록");
				System.out.println("추가메뉴:1.일반 2.회사 3.동창 ");
				String menu2 = sc.nextLine();
				switch (menu2) {
				case"1":
					m.add();
					break;
				case"2":
					m.cadd();
					break;
				case"3":
					m.uadd();
					break;
				}
				
				break;
				
			case"2":
				System.out.println("1.일반 2.회사 3.동창 ");
				String menu3 = sc.nextLine();
				switch (menu3) {
				case"1":
					m.listPhoneInfo();
					break;
				case"2":
					m.listPhoneInfoCompany();
					break;
				case"3":
					m.listPhoneInfoUniverse();
					break;
				}
				break;
				
			case"3":
//				m.search();
				break;
				
			case"4":
				System.out.println("종료합니다.");
				run = false;
				break;
			}
		}
	}

}
