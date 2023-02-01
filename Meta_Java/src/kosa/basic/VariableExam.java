package kosa.basic;

import com.sun.javadoc.Type;

public class VariableExam {

	public static void main(String[] args) {
		//변수선언시 주의사항
		//변수명은 특수문자X, 숫자로시작X, 소문자로시작, 합성어 -> 두번째 단어 첫자 대문자
		
		int num; // 변수 선언(메모리 할당)
		num = 10; // 변수 초기화
		int num2 = 20;
		System.out.println( num + num2 );
		
		//기본 리터럴
		//정수값 => int, 실수값 => double, 'A' => char, "문자열" => String, true => boolean
		double d = 3.14;
		float f = 3.14f;
		
		//byte < short < int < long < float < double
		//형변환(Casting)
		//묵시적 형변환
		//큰데이터형 <--- 작은 데이터형 (O)
		//큰데이터형 ---> 작은 데이터형 (X) => 강제형변환이 필요
		
		//강제형변환 => 데이터 손실 유발
		int b = (int)3.14;
		System.out.println("b : " + b);
		
		double num3 = 3.14 + 1;
		System.out.println(num3);
		if(num3 == 4.14){
		System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		//int <==> char(아스키코드)
		char num4 = 'A';
		System.out.println((int)num4);
		
		String str = new String("AAA");
		String str2 = "BBB";
		
		//String <==> int
		String num5 = "1";
		int num6 = Integer.parseInt(num5);
		int result = num6 + 1;
		System.out.println(result);
		
		//int => String
		int num7 = 100;
		String num8 = String.valueOf(num7);
		String num9 = num7 + "";
		System.out.println(num9);
		
		//퀴즈
		String str4 = 7 + "7" + 7;
		System.out.println(str4);
		
		}
		
	}


