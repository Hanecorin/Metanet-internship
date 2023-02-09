package kosa.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	List<Reservation> reservation;
	List<Reservation> checkInList;
	List<Room> roomList;

	public Hotel() {
		reservation = new ArrayList<Reservation>();
		checkInList = new ArrayList<Reservation>();
		roomList = new ArrayList<Room>();
		Room r1 = new Room(101, "A", 1000, false);
		Room r2 = new Room(102, "A", 1000, false);
		Room r3 = new Room(103, "A", 1000, false);
		Room r4 = new Room(201, "B", 2000, false);
		Room r5 = new Room(202, "B", 2000, false);
		Room r6 = new Room(203, "B", 2000, false);
		Room r7 = new Room(301, "C", 3000, false);
		Room r8 = new Room(302, "C", 3000, false);
		Room r9 = new Room(303, "C", 3000, false);
		roomList.add(r1);
		roomList.add(r2);
		roomList.add(r3);
		roomList.add(r4);
		roomList.add(r5);
		roomList.add(r6);
		roomList.add(r7);
		roomList.add(r8);
		roomList.add(r9);
	}

	// 예약하기
	public void addReserve(Reservation res) {
		reservation.add(res);
		System.out.println("예약이 완료되었습니다. 예약번호는" + res.getResNo() + "입니다.");
	}

	// 예약 가능한 방이 있는지
	public Room checkRoom(String type) {
		for (Room r : roomList) {
			if (type.equals(r.getType()) && r.isChecked() == false) {
				System.out.println("예약가능한방이있습니다.");
				r.setChecked(true);
				return r;
			}

		}
		System.out.println("예약가능한 방이없습니다.");
		return null;
	}

	// 예약 취소(예약번호를 받음)
	//예약 취소(예약번호를 받음)
		public void deleteReserve(int num) {
			for(Reservation res : reservation) {
				int check=res.getResNo();
				if(check==num) {
					res.getRoom().setChecked(false);
					reservation.remove(res);
					System.out.println("취소가 완료되었습니다.");
					return;
				}
			}
			System.out.println("일치하는 예약번호가 없습니다.");
			return;
		}


	// 체크인
	public void checkIn(int resNo) {
		for (Reservation res : reservation) {
			int check = res.getResNo();
			if (check == resNo) {
				reservation.remove(res);
				checkInList.add(res);
				System.out.println("체크인이 완료되었습니다. 객실번호는 " + res.getRoom().getRoomNo());
				return;
			}
		}
		System.out.println("일치하는 예약번호가 없습니다.");
		return;
	}

	// 체크아웃
	//체크아웃
		public Bill checkOut(int rno)  {
			for(Reservation res : checkInList) {
				int check=res.getRoom().getRoomNo();
				if(check==rno) {
					res.getRoom().setChecked(false);
					checkInList.remove(res);
					System.out.println("체크아웃이 완료되었습니다.");
					Bill bill = new Bill(res.getCustomer().getName(), res.getRoom().getType(), res.getRoom().getPrice()*res.getDay());
					return bill;
				}
			}
			return null;
		}


	// 예약목룍 출력(관리자)
	public void showReserveList() {
		if (!reservation.isEmpty()) {
			for (Reservation res : reservation) {
				System.out.println("예약자명 : " + res.getCustomer().getName() + "예약 번호 : " + res.getResNo());
			}
			return;
		} else if (reservation.isEmpty()) {
			System.out.println("예약목록이 비어있습니다.");
			return;
		}
	}

	// 한 사람의 예약한 목록 출력
	public void showReserve(int c_resno) {
		for (Reservation i : reservation) {
			if (i.getResNo() == c_resno) {
				System.out.println("예약한 사람 : " + i.getCustomer().getName());
				System.out.println("예약한 객실타입 : " + i.getRoom().getType());
				System.out.println("투숙일 : " + i.getDay() + "일");
				System.out.println("객실번호 : " + i.getRoom().getRoomNo());
			} else {
				System.out.println("일치하는 예약번호가 없습니다.");
				return;
			}
		}
	}

	// 관리자 비밀번호 일치
	public void passCheck(int pass) {
		if (pass == 1111) {
			System.out.println("관리자모드를 실행합니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

	// 노쇼 삭제
	public void noShow() {//#
		reservation.clear();
	}

	// 결제
	public void payment(Bill bill, String payment) {

		if (payment.equals("2")) {
			System.out.println("결제방식은 카드입니다. 결제가 완료되었습니다.");
			Pay pay = new Pay(bill);
			System.out.println("영수증 - " + "이름 : " + pay.getBill().getName() + "/ 객실 타입 : " + pay.getBill().getName() +"/ 결제금액 : "+ pay.getBill().getPrice() +
					"/ 결제된 가격 : " + pay.getBill().getPrice());
			return;
		}
	}

	public void payment(Bill bill, String payment, int amount) {

		if (payment.equals("1")) {
			System.out.println("결제방식은 현금입니다. ");
			if (amount < bill.getPrice()) {
				System.out.println("결제 금액보다 적습니다.");
				return;
			} else if (amount > bill.getPrice()) {
				Pay pay = new Pay(bill);
				System.out.println("영수증 - " + "이름: " + pay.getBill().getName() + "/ 객실 타입: " + pay.getBill().getType() + "/ 결제된 가격 : " + pay.getBill().getPrice() + 
						"/ 거스름 돈 : " + (amount-bill.getPrice()));
				return;
			}
			return;
		}
		if (payment.equals("3")) {
			System.out.println("결제방식은 수표입니다. ");
			if (amount < bill.getPrice()) {
				System.out.println("결제 금액보다 적습니다.");
				return;
			} else if (amount > bill.getPrice()) {
				Pay pay = new Pay(bill);
				System.out.println("영수증 - " + "이름: " + pay.getBill().getName() + "/ 객실 타입: " + pay.getBill().getType() + "/ 결제된 가격 : " + pay.getBill().getPrice() + 
						"/ 거스름 돈 : " + (amount-bill.getPrice()));
				return;
			}
			return;
		}

	}

}

// 계산서 생성
//	public void payment(Bill bill, String payment) {
//
//		if (payment == "2") {
//			System.out.println("결제방식은 카드입니다. 결제가 완료되었습니다.");
//			Pay pay = new Pay(bill);
//			System.out.println("이름: " + pay.getBill().getName() + " 객실 타입: " + pay.getBill().getName() +"결제금액 : "+ + " 결제된 가격 : " + pay.getBill().getPrice());
//			return;
//		} else {
//			System.out.println("올바르지 않은 결제방식입니다.");
//			return;
//		}
//
//	}
//
//	public void payment(Bill bill, String payment, int amount) {
//		if (payment == "1") {
//			System.out.println("결제방식은 현금입니다. ");
//			if (amount<bill.getPrice()) {
//				System.out.println("결제 금액보다 적습니다.");
//				return;	
//			}
//			else if (amount>bill.getPrice()) {
//				System.out.println("결제가 완료되었습니다. 거스름돈은 " + (amount-bill.getPrice()) + " 입니다.");
//				Pay pay = new Pay(bill);
//				System.out.println("이름: " + pay.getBill().getName() + " 객실 타입: " + pay.getBill().getType() + " 결제된 가격 : " + pay.getBill().getPrice() + " 거스름 돈 : " + (amount-bill.getPrice()));
//				return;
//			}
//			return;
//		}
//		if (payment == "3") {
//			System.out.println("결제방식은 수표입니다. ");
//			if (amount<bill.getPrice()) {
//				System.out.println("결제 금액보다 적습니다.");
//				return;
//			}
//			else if (amount>bill.getPrice()) {
//				System.out.println("결제가 완료되었습니다. 거스름돈은 " + (amount-bill.getPrice()) + " 입니다.");
//				Pay pay = new Pay(bill);
//				System.out.println("이름: " + pay.getBill().getName() + " 객실 타입: " + pay.getBill().getType() + " 결제된 가격 : " + pay.getBill().getPrice() + " 거스름 돈 : " + (amount-bill.getPrice()));
//				return;
//			}
//			return;
//		}
//
//	}
