package kosa.board;

import java.util.Scanner;

public class BoardManager {
	Board arr[] = new Board[10]; //게시판 객체 생성
	Reply rp = new Reply();
	Reply r[] = new Reply[10];
	static Scanner sc = new Scanner(System.in);
	int count;
	
	public void boardAdd() { //글쓰기
		System.out.println("글번호: ");
		int bNo = sc.nextInt();
		
		sc.nextLine(); // 에러방지용
		
		System.out.println("제목: ");
		String bHead = sc.nextLine();
		
		System.out.println("작성자: ");
		String bName = sc.nextLine();
		
		System.out.println("글내용: ");
		String bContent = sc.nextLine();
		
		arr[count++] = new Board(bNo, bHead, bName, bContent, rp); // 배열안에 폰인포 객체를 추가
	}
	
	public void replyAdd() { // 댓글달기
		
		System.out.println("댓글 번호: ");
		int rNo = sc.nextInt();
		
		sc.nextLine(); // 에러방지용
		
		System.out.println("댓글 작성자: ");
		String rName = sc.nextLine();
		
		System.out.println("댓글 내용: ");
		String rContent = sc.nextLine();
		
		r[count++] = new Reply(rNo, rName, rContent); // 리플 배열안에
	}
	
	public void boardList() {// 글 목록 보기
		for (int i = 0; i< count; i++) {
			arr[i].list();
		}
	}
	
	public void boardContent() { // 책번호로 글 세부내용
		System.out.println("검색번호: ");
		int bNo = sc.nextInt();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (bNo == (arr[i].getbNo())) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.printf("해당 글은 존재하지 않습니다.");
		} else {
			System.out.println((idx + 1) + "번째 글입니다.");
			arr[idx].show();
		}
	}
	
	
	
}
