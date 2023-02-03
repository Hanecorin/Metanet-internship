package kosa.video;

public class GeneralMember {
	// id, 이름, 주소, 빌린비디오(번호,제목,주인공)

	private String id;
	private String name;
	private String address;
	private Video video;

	public GeneralMember() {
	} // 기본 생성자

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public GeneralMember(String id, String name, String address, Video video) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.video = video;
	}

	public void show() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("비디오 번호 : "  + video.getSno());
		System.out.println("비디오 제목 : "  + video.getTitle());
		System.out.println("배우 : "  + video.getActor());

	}

}
