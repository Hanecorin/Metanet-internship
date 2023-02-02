package kosa.phone;

public class PhoneInfo {
	//상태: 이름, 전화번호, 생년월일(name, phoneNo, birth)
	
	private String name;
	private String phoneNo;
	private String birth;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public PhoneInfo() {} // 디폴트 생성자
	
	public void show() {  
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("생년월일: " + birth);
	}	//기능: 1인 전화내역 출력(show)
}
