package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;


public class ArrayExam {

	public static void main(String[] args) {
		
		int arr[] = {3,2,4};
		int brr[] = arr;
		
		
//		arr[0] = 5;
//		System.out.println("Arr : " + arr[0]);
//		System.out.println("Brr : " + brr[0]);
//
//		brr[0] = 10;
//		System.out.println("Arr : " + arr[0]);
//		System.out.println("Brr : " + brr[0]);

//		System.out.println(Arrays.toString(arr));
//		
//		Arrays.sort(arr); //오름차순
//		System.out.println(Arrays.toString(arr));
		
		//내림차순
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[arr.length-1-i] + ", ");
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]+",");
//		}
		
		int arr2[][] = {{2,90},{1,60},{3,20}};
		
		Arrays.sort(arr2, new Comparator<int[]>() {
		
			@Override
			public int compare(int[] o1, int[] o2) {
				//정렬기준 작성 : 1차원 배열 안에 첫번째 요소를 기준으로 오름차순
				if(o1[0] < o2[0]) {
					return -1; // 자리 이동X
				}else if(o1[0] > o2[0]) {
					return 1; // 자리 이동O
				}else {
					return 0;	
				}
				
			}
		});
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
