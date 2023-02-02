package kosa.mission;

import java.util.Arrays;

public class Mission02 {

	public static void main(String[] args) {
		//여러명의 성적을 관리할 수 있는 프로그램을 구현해 보자.
		//키보드로 부터 각 과목별로 점수를 선언해서 구현하자.
		//번호 국어 영어 수학 총점 평균
		// 1  90 98 91 
		// 2  21 45 43
		//===========================
		//   국총 영총 수총 총총 
		
		
		int arr[][] =  {{1,90,98,91},{2,21,45,43}};
		// int 배열
        
        // 합계 계산
		
        int sum1 = Arrays.stream(arr[0]).sum()-arr[0][0];
        double avg1 = (double) sum1/(arr[0].length-1);
        
        int sum2 = Arrays.stream(arr[1]).sum()-arr[1][0];
        double avg2 = (double) sum2/(arr[1].length-1);
        
        int sum = 0;
        double avg = 0.0;
        
        int avg_su = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr[i].length; j++) {
                sum += arr[i][j]; 
                avg_su += 1;
            }
        }
        avg = (double) sum / avg_su;
//        System.out.println("총합 : " + sum);
//
//        System.out.println("평균 : " + avg);
        
        System.out.println("번호 국어 영어 수학 총점 평균");
        
		System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]+" "+arr[0][3]+" "+sum1+" "+avg1 );
		System.out.println(arr[1][0]+" "+arr[1][1]+" "+arr[1][2]+" "+arr[1][3]+" "+sum2+" "+avg2 );
		System.out.println("==============================================================");
		System.out.println(" "+sum+" "+avg);

	}

}
