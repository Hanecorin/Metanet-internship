package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMission {

	public static void main(String[] args) {
		// 로또번호 1 ~ 45 중복되지 않는 정수 6개를 출력
		Random random = new Random();
		// 1. 배열
//		int[] lotto = new int[6];

//
//		// 랜덤번호 생성
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = random.nextInt(45) + 1;
//			System.out.println(lotto[i]);
//			// 중복번호 제거
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(lotto);
//		System.out.println("* 로또번호 : " + Arrays.toString(lotto));

		// 2. List(ArrayList)

//		List<Integer> lottoNumber = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = random.nextInt(45)+1;
//			if(lottoNumber.contains(n)) {
//				continue;
//			}else {
//				lottoNumber.add(n);
//			}
//			if(lottoNumber.size() == 6) break;
//		}
//		Collections.sort(lottoNumber);
//		System.out.println(lottoNumber);

		// 단순 셔플 후 앞에 6개만받음
//		for (int i = 1; i <= 45; i++) {
//			lottoNumber.add(i);
//		}
//		System.out.println("lottoNumber 확인 : " + lottoNumber.toString());
//		Collections.shuffle(lottoNumber);
//		for (int i = 0; i < 6; i++) {
//			System.out.println((i + 1) + "번째 번호는 '" + lottoNumber.get(i) + "' 입니다. ");
//		}

		// 3. Set(TreeSet)

		// 기본 정렬 조건 : Comparable -> compareTo() 오버라이딩
		// 정렬 기준 변경 : Comparator -> compare() 오버라이딩
		// 한번쓸거니까 익명클래스로(lamda)만듦
		// TreeSet 정렬됨
//		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// 내림차순 정렬기준 정의
//				if (o1 < o2) {
//					return 1;
//				} else if (o1 > o2) {
//					return -1;
//				}
//				return 0;
//			}
//		});
		Set<Integer> set = new TreeSet<Integer>((Integer o1, Integer o2) -> o2 - o1);
		

		for (

				int i = 0; set.size() < 6; i++) {
			set.add(random.nextInt(45) + 1);
		}
		System.out.println(set);
	}

}
