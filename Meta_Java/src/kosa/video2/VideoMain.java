package kosa.video2;

public class VideoMain {

	public static void main(String[] args) {
		Video v1 = new Video("1", "탑건2", "톰크루즈");
		Video v2 = new Video("2", "아바타2", "모름");
		
		GeneralMember arr[] = {
				new GeneralMember("aa", "홍길동", "송파"),
				new SpecialMember("bb", "홍길동", "송파",0)
		};
		
		for(int i=0;i<arr.length;i++) {
			arr[i].rental(v1);
			arr[i].show();
		}
//		GeneralMember gm = new GeneralMember("aa", "홍길동", "송파");
//		SpecialMember sm = new SpecialMember()
//		gm.rental(v2);
//		gm.show();
//		sm.show2();
	}

}