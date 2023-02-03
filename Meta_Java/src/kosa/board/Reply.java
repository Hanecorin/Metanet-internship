package kosa.board;

public class Reply {
	private int rNo;
	private String rName;
	private String rContent;
	
	
	public Reply() {} // 기본 생성자


	public Reply(int rNo, String rName, String rContent) {
		super();
		this.rNo = rNo;
		this.rName = rName;
		this.rContent = rContent;
	}


	public int getrNo() {
		return rNo;
	}


	public void setrNo(int rNo) {
		this.rNo = rNo;
	}


	public String getrName() {
		return rName;
	}


	public void setrName(String rName) {
		this.rName = rName;
	}


	public String getrContent() {
		return rContent;
	}


	public void setrContent(String rContent) {
		this.rContent = rContent;
	}
	
	public void show() {
		System.out.println("댓글번호: " + rNo);
		System.out.println("댓글 작성자: " + rName);
		System.out.println("댓글 내용: " + rContent);
	}
	
}
