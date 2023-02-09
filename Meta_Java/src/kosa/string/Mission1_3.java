package kosa.string;

import java.util.Scanner;

public class Mission1_3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 문장을 입력받는다.
		System.out.println("문장을 입력하세요 :");
		String input = in.next();
		// 문장을 빈칸으로 잘라 String배열에 문자를 담는다.
		String[] arr = input.split(" ");
		String answer = "";
		// 가장 작은 값으로 초기화
		int m = 0;

		for (String x : arr) {
			// 문자열의 길이 저장
			int len = x.length();
			// m보다 크면 m에 문자열길이 저장, answer에 문자열 저장.
			if (len > m) {
				m = len;
				answer = x;
			
			}
		}

		// 가장 긴 문자열을 출력
		System.out.println("===");
		System.out.println(answer);
	}
}
