package kosa.mission;

import java.util.Scanner;



public class Mission01 {

	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체자리수 중 짝수, 홀수의 개수를 구하자.
		//5자리수 ex)12345
		//짝수의 개수 : 2개
		//홀수의 개수 : 3개				
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 정수 입력: ");
		int num = sc.nextInt(); // 입력받는 숫자
		int even = 0; // 짝수개수 초기화
		int odd = 0; // 홀수개수 초기화
		even += (num%2 == 0) ? 1: 0; // 1의 자리
		
		even += (num/10%10%2 == 0) ? 1: 0; // 10의 자리
		
		even += (num/100%10%2 == 0) ? 1: 0; // 100의 자리
		
		even += (num/1000%10%2 == 0) ? 1: 0; // 1000의 자리
		
		even += (num/10000%2 == 0) ? 1 : 0; // 10000의 자리
		
		System.out.println(num/10000);
		System.out.println(num/1000%10); 
		System.out.println(num/100%10);
		System.out.println(num/10%10);
		System.out.println(num%10);
		

		odd = 5 - even; // 홀수 = 전체자리수 - 짝수

		System.out.println("짝수의 개수:"+even);
		System.out.println("홀수의 개수:"+odd);
	
	}
}
