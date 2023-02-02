package kosa.board;

public class Board {

	// 상태 : 글번호, 제목, 작성자, 글내용
	// 기능 : 글쓰기, 글 목록 보기, 글 세부 보기

	private int bNo;
	private String bHead;
	private String bName;
	private String bContent;

	public Board() {
	}

	public Board(int bNo, String bHead, String bName, String bContent) {
		super();
		this.bNo = bNo;
		this.bHead = bHead;
		this.bName = bName;
		this.bContent = bContent;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbHead() {
		return bHead;
	}

	public void setbHead(String bHead) {
		this.bHead = bHead;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public void show() { // 글 정보
		System.out.println("글번호: " + bNo);
		System.out.println("제목: " + bHead);
		System.out.println("작성자: " + bName);
		System.out.println("글내용: " + bContent);
	}

	public void list() { // 글 목록 보려고
		System.out.println("글번호: " + bNo + " 제목: " + bHead);
		System.out.println("=================================");
	}

}
