package kosa.hotel;

public class Room {

	private int roomNo;
	private String type;
	private int price;
	private boolean isChecked;
	
	public Room () {}

	public Room(int roomNo, String type, int price, boolean isChecked) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.price = price;
		this.isChecked = isChecked;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	
	
}
