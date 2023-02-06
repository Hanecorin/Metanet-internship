package kosa.phone;

public class Company extends PhoneInfo {

	private String dept;
	private String position;
	
	public Company() {}

	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void show() {  
		System.out.println("이름: " + getName());
		System.out.println("전화번호: " + getPhoneNo());
		System.out.println("생년월일: " + getBirth());
		System.out.println("부서이름: " + dept);
		System.out.println("직급: " + position);
		
	}
	
}
