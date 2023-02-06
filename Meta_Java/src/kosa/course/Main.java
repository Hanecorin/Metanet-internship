package kosa.course;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("한예찬");
		Student s2 = new Student("한예찬2");
		
		Course c1 = new Course("국어");
		Course c2 = new Course("수학");
		Course c3 = new Course("영어");
		
	
		
		s1.register(c1);
		s1.register(c2);
		s1.register(c3);
		s1.dropCourse(c1);
//		s1.dropCourse(c2);
		s2.register(c1);
		
		
		s1.show();
		s2.show();
		
		c1.show();
		c2.show();
		c3.show();
		
		
		
		
		
			
	}
}
