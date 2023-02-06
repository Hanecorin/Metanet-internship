package kosa.course;

import java.util.ArrayList;

public class Course {

	private String courseName;
	private ArrayList<Student> students;
	
	
	public Course() {}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>(); // 생성자에서 초기화 시켜야함 !!
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void show() {
		System.out.println("해당과목은 : " + courseName + "입니다.");
		for(Student student : students) {
			System.out.println("수강 신청 학생명: " + student.getName());
		}
		System.out.println("===================================");
	}
}
