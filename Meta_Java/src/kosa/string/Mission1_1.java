package kosa.string;

import java.util.Scanner;

public class Mission1_1 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력 : ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		char ch = sc.next().charAt(0);
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
	System.out.println("포함된 개수: " + count);
		
	}
	
	
}
