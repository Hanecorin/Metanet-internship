package kosa.phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Manager {
//	PhoneInfo arr[] = new PhoneInfo[10]; // 폰인포 객체 10개 생성
	List<PhoneInfo> arr = new ArrayList<PhoneInfo>();
	static Scanner sc = new Scanner(System.in);

	int count;

	public void add() { // 추가
		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();

		System.out.println("생년월일: ");
		String birth = sc.nextLine();

		arr.add(new PhoneInfo(name, phoneNo, birth)); // 배열안에 폰인포 객체를 추가
	}

	public void cadd() {
		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();

		System.out.println("생년월일: ");
		String birth = sc.nextLine();

		System.out.println("부서: ");
		String dept = sc.nextLine();

		System.out.println("직급: ");
		String position = sc.nextLine();

		arr.add(new Company(name, phoneNo, birth, dept, position)); // 배열안에 폰인포 객체를 추가
	}

	public void uadd() {
		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();

		System.out.println("생년월일: ");
		String birth = sc.nextLine();

		System.out.println("전공: ");
		String major = sc.nextLine();

		System.out.println("학년: ");
		String year = sc.nextLine();

		arr.add(new Universe(name, phoneNo, birth, major, year)); // 배열안에 폰인포 객체를 추가
	}

	Iterator<PhoneInfo> iterator = arr.iterator();

	public void listPhoneInfo() { // 전체 출력

		for (PhoneInfo a : arr) {
			a.show();
		}
	}

	public void listPhoneInfoCompany() { // 전체 출력
		while (iterator.hasNext()) {
			PhoneInfo str = iterator.next();
			if (str instanceof Company) {
				str.show();
			}
			
		}
	}


	public void listPhoneInfoUniverse() { // 전체 출력
		while (iterator.hasNext()) {
			PhoneInfo str = iterator.next();
			if (str instanceof Universe) {
				System.out.println(str);
			}
			
		}
	}

//	public void search() { // 검색
//		System.out.println("검색이름: ");
//		String name = sc.nextLine();
//		int idx = -1;
//
//		for (int i = 0; i < count; i++) {
//			if (name.equals(arr[i].getName())) {
//				idx = i;
//			}
//		}
//		if (idx == -1) {
//			System.out.printf("해당 이름은 존재하지 않습니다.");
//		} else {
//			System.out.println((idx + 1) + "번째 있습니다.");
//			arr[idx].show();
//		}
//	}
//
}