package kosa.hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel();
		int resno = 1; // 예약번호

		while (true) {
			System.out.println("1. 예약모드 2.관리자모드");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {

				while (true) {
					System.out.println("1. 예약하기  2.예약취소 3.체크인하기  4.체크아웃하기  5.예약확인 6.종료");

					int menu = Integer.parseInt(sc.nextLine());

					switch (menu) {

					case 1:

						System.out.println("이름을 입력해주세요.");
						String name = sc.nextLine();
						System.out.println("핸드폰 번호를 입력해주세요");
						String phoneNO = sc.nextLine();
						System.out.println("예약할 객실타입(A,B,C)을 작성해주세요.");
						String type = sc.nextLine();

						Room room = hotel.checkRoom(type);

						if (!(type.equals("A") || type.equals("B") || type.equals("C")) || room == null) {
							while (true) {

								System.out.println("객실타입을 다시 선택해주세요");
								type = sc.nextLine();
								room = hotel.checkRoom(type);

								if ((type.equals("A") || type.equals("B") || type.equals("C")) && !(room == null)) {
									break;
								}
							}
						}

						System.out.println("투숙할 일수를 작성해주세요.");
						int day = Integer.parseInt(sc.nextLine());

						hotel.addReserve(new Reservation(new Customer(name, phoneNO), room, resno++, day));
						break;
					case 2:
						System.out.println("예약번호를 작성해주세요");
						int w_resno = Integer.parseInt(sc.nextLine());
						hotel.deleteReserve(w_resno);

						break;
					case 3:
						System.out.println("예약번호를 입력해주세요.");
						int w_checkin = Integer.parseInt(sc.nextLine());
						hotel.checkIn(w_checkin);
						break;
					case 4:
						System.out.println("객실번호를 입력하세요.");
						int w_roomNo = Integer.parseInt(sc.nextLine());

						System.out.println("결제수단을 선택하세요.");
						System.out.println("1. 현금  2. 카드   3.수표");
						String payment = sc.nextLine();

						if (payment.equals("1") || payment.equals("3")) {
							System.out.println("잔액을 입력해주세요");
							int a = Integer.parseInt(sc.nextLine());
							hotel.payment(hotel.checkOut(w_roomNo), payment, a);
						}
						hotel.payment(hotel.checkOut(w_roomNo), payment);

						break;

					// 예약확인
					case 5:
						System.out.println("예약번호를 입력하세요");
						int check = Integer.parseInt(sc.nextLine());

						hotel.showReserve(check);
						break;

					case 6:
						System.out.println("종료");
						break;

					}
					break;
				}
			} else {
				System.out.println("비밀번호를 입력해주세요");
				int pass = Integer.parseInt(sc.nextLine());
				hotel.passCheck(pass);

				while (true) {
					System.out.println("1. 예약 전체목록 확인  2.노쇼 고객 삭제");
					int a_select = Integer.parseInt(sc.nextLine());

					switch (a_select) {
					case 1:
						hotel.showReserveList();
						break;

					case 2:
						hotel.noShow();
						break;

					}
					break;
				}

			}

		}

	}
}
