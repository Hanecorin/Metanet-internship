package kosa.course;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Course> courses;

	public Student() {
		courses = new ArrayList<Course>();
	}

	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void show() {
		System.out.println("학생 이름은 : " + name + "입니다.");
		for (Course course : courses) {
			System.out.println("선택한 과목은 : " + course.getCourseName() + "입니다.");
		}

	}
}
