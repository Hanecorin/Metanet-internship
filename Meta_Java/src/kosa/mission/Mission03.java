package kosa.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Mission03 {

	static int count = 0;
	static Scanner sc = new Scanner(System.in);

	public static void add(String arr[]) {
		System.out.printf("이름: ");
		arr[count++] = sc.nextLine(); // 입력값을 배열에 추가

	}

	public static void print(String arr[]) {
		for (int i = 0; i < count; i++) {
			System.out.printf(arr[i] + ", ");
		}
		System.out.println();
	}

	public static void search(String arr[]) {
		System.out.printf("검색이름: ");
		String str = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.printf("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.printf((idx + 1) + "번째 있습니다.");
		}
	}

	public static void update(String arr[]) {
		System.out.printf("수정이름: ");
		String str = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.printf("해당 이름은 존재하지 않습니다.");
		} else {
			System.out.printf("수정할 이름: ");
			arr[idx] = sc.nextLine();

		}
	}

	public static void delete(String arr[]) {
		System.out.printf("삭제할이름: ");
		String str = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.printf("해당 이름은 존재하지 않습니다.");
		} else {
			for (int i = idx; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
		}
	}

	public static void main(String[] args) {
		// 배열에 문자열
//		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String[] arr = new String[10];

		while (run) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.printf("메뉴 입력:");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				add(arr);
				break;

			case "2":
				print(arr);
				break;

			case "3":

				search(arr);
				break;

			case "4":
				update(arr);
				break;

			case "5":
				delete(arr);
				break;

			case "6":
				System.out.println("종료합니다.");
				run = false;
				break;
			}
		}
	}

}
