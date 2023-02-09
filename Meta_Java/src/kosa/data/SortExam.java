package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();

		list.add(new Person("한예찬1", 20));
		list.add(new Person("김예찬2", 70));
		list.add(new Person("박예찬3", 60));
		list.add(new Person("이예찬4", 50));
		list.add(new Person("최예찬5", 30));
		list.add(new Person("a예찬6", 40));

//		Collections.sort(list);

		// 이름 오름차순
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// 왼쪽이 작은경우 ex) a와 b일때 아스키 코드 a-b는 마이너스이므로 왼쪽이 작다
				// a.CompareTo(b)
				if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				} else if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				}
				return 0;
			}

		});

		System.out.println(list);

	}

}
