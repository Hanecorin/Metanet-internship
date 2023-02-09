package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로 수학수식을 입력
		// ((2+3)+10) => 괄호 일치 / 불일치 판단

		Scanner sc = new Scanner(System.in);
		System.out.println("수식을 입력하세요: ");
		String str = sc.nextLine();

		Stack<String> stack = new Stack<String>();
		try {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); //글자 하나하나 

				if (ch == '(') {
					stack.push(ch + ""); //열었으니까 stack에 추가
				} else if (ch == ')') { // 닫았으니까 stack에서 제거
					stack.pop();
				}
			}
			if (stack.isEmpty()) { //있는지없는지 판단  스택에 없어야 닫힌 괄호이기 때문에 if 
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치 합니다.");
			}
		} catch (Exception e) {
			System.out.println("괄호가 불일치 합니다."); //예외처리(닫힌괄호가 많아도 스택에 추가가 안되어서 해줘야함)

		}

		
		
	}
}