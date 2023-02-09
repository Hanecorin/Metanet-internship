package kosa.hotel;

public class Reservation {
	private Customer customer;
	private Room room;
	private int resNo;
	private int day;
	
	public Reservation() {}

	public Reservation(Customer customer, Room room, int resNo, int day) {
		super();
		this.customer = customer;
		this.room = room;
		this.resNo = resNo;
		this.day = day;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getResNo() {
		return resNo;
	}

	public void setResNo(int resNo) {
		this.resNo = resNo;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
	
}
