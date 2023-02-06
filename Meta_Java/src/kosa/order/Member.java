package kosa.order;

public class Member {

	private String name;
	private String address;
	
	public Member() {}
	
	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void show() {
		System.out.println("회원이름 : " + name);
		System.out.println("주소 : " + address);
	}
	
}
