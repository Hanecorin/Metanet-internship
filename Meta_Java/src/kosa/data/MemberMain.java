package kosa.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberMain {

	public static void main(String[] args) {
		//List에 Member객체 3개를 추가
		//stream을 이용해서 출력해 보자.
		
		List<Member> list = new ArrayList<Member>();
		
		IntStream.range(0, 3).forEach(i -> list.add(new Member("user" + i)));
		
		list.parallelStream().forEach(member ->System.out.println(member.getName()));
//		Member m1 = new Member("한예찬1");
//		Member m2 = new Member("한예찬2");
//		Member m3 = new Member("한예찬3");
//		
//		list.add(m1);
//		list.add(m2);
//		list.add(m3);
		
//		Stream<Member> stream = list.stream();
//		
//		stream.sorted().forEach(System.out::println);
		
		

	}

}
