package kosa.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// 1. 글쓰기, 2. 글목록 보기, 3. 글세부보기 4. 종료
		BoardManager bm = new BoardManager();
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("1.글쓰기 2.글목록 보기 3.글 세부보기  4.댓글 5.댓글보기 6.종료");
			System.out.println("메뉴: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				bm.boardAdd();
				break;

			case "2":
				bm.boardList();
				break;

			case "3":
				bm.boardContent();
				break;
			
			case "4":
				bm.replyAdd();
				break;
				
			case "5":
				bm.replyAdd();
				break;

			case "6":
				run = false;
				break;

			}
		}

	}

}
