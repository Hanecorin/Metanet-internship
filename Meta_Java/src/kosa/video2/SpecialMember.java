package kosa.video2;

import kosa.video2.GeneralMember;


public class SpecialMember extends GeneralMember {
	private int point;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);
		this.point = point;
	}
	
//	public void rentalVideo2(Video video) {
//		super.rental(video);
//		point +=10;
//	}
	
//	public void show2() {
//		super.show();
//		System.out.println("회원의 보너스 포인트 적립: " + point);
//	}

	@Override
	public void show() {
		super.show();
		System.out.println("회원의 보너스 포인트 적립: " + point);
	}

	@Override
	public void rental(Video video) {
		super.rental(video);
		point +=10;
	}
	
}
