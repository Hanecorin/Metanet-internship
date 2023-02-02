package kosa.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10]; // 폰인포 객체 10개 생성
	static Scanner sc = new Scanner(System.in);
	int count;

	public void add() { // 추가
		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("전화번호: ");
		String phoneNo = sc.nextLine();

		System.out.println("생년월일: ");
		String birth = sc.nextLine();

		arr[count++] = new PhoneInfo(name, phoneNo, birth); // 배열안에 폰인포 객체를 추가
	}

	public void listPhoneInfo() { // 전체 출력
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void search() { // 검색
		System.out.println("검색이름: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.printf("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.println((idx + 1) + "번째 있습니다.");
			arr[idx].show();
		}
	}

}