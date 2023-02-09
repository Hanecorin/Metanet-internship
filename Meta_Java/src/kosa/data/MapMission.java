package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapMission {

	public static void main(String[] args) {
		// 이름,정수를 한쌍으로 Map 자료구조로 구현하자. => 김자바:80, 박자바:90

		// 1. 시험 응시자만 출력
		// 2. 총점,평균,최고점수,최저점수 : Collections => max(), min()

		Map<String, Integer> map = new HashMap<String, Integer>();
//
//		map.put("한예찬1", 90);
//		map.put("한예찬2", 80);
//		map.put("한예찬3", 70);
//
//		Set set1 = map.keySet();
//		Collection collection = map.values();
//
//		Iterator iter = set1.iterator();
//
//		set1.stream().forEach(System.out::println);
//		int sum = 0;
//		for (int value : map.values()) {
//			sum += value;
//		}
//		System.out.println("총점: " + sum);
//
//		int avg = 0;
//
//		avg = sum / map.size();
//
//		System.out.println("평균 : " + avg);
//
//		Comparable max = Collections.max(collection);
//		Comparable min = Collections.min(collection);
//
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		//강사님 

		map.put("한예찬1", 90);
		map.put("한예찬2", 80);
		map.put("한예찬3", 70);
		//map => key
		Set<String> set = map.keySet();
		System.out.println("응시자명단 : " + set);
		
		//map => value
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		
		int sum = 0;
		
		while(iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println("총점: "+sum);
		System.out.println("평균: "+sum/map.size());
		System.out.println("최고점: "+ Collections.max(values));
		System.out.println("최저점: "+ Collections.min(values));
		
		
	}

}
