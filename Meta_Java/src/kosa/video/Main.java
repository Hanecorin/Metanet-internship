package kosa.video;



public class Main {

	public static void main(String[] args) {
		Video v = new Video();
		v.setSno("bbb");
		v.setTitle("kosa");
		v.setActor("메타넷");
		
		GeneralMember gm = new GeneralMember();
		gm.setId("123");
		gm.setName("비디오");
		gm.setAddress("송파");
		gm.setVideo(v);
		
		gm.show();
		
	}

}
