package kosa.board;

public class Board {

	// 상태 : 글번호, 제목, 작성자, 글내용
	// 기능 : 글쓰기, 글 목록 보기, 글 세부 보기

	private int bNo;
	private String bHead;
	private String bName;
	private String bContent;
	private Reply reply;

	public Board() {
	}

	public Board(int bNo, String bHead, String bName, String bContent, Reply reply) {
		super();
		this.bNo = bNo;
		this.bHead = bHead;
		this.bName = bName;
		this.bContent = bContent;
		this.reply = reply;
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
	
	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public void show() { // 글 정보
		System.out.println("글번호: " + bNo);
		System.out.println("제목: " + bHead);
		System.out.println("작성자: " + bName);
		System.out.println("글내용: " + bContent);
		System.out.println("댓글번호: " + reply.getrNo());
		System.out.println("댓글 작성자: " + reply.getrName());
		System.out.println("댓글 내용: " + reply.getrContent());
	}

	public void list() { // 글 목록
		System.out.println("글번호: " + bNo + " 제목: " + bHead);
		System.out.println("=================================");
	}

}
