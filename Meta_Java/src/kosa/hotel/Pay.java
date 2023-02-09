package kosa.hotel;

public class Pay {
	
	private Bill bill;
	
	public Pay () {}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Pay(Bill bill) {
		super();
		this.bill = bill;
	}
	
}
