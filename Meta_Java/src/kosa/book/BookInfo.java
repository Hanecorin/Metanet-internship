package kosa.book;

public class BookInfo {
	
	private String name;
	private int price;
	private int dcPrice;
	
	public BookInfo(String name, int price, int dcPrice) {
		super();
		this.name = name;
		this.price = price;
		this.dcPrice = dcPrice;
	}

	public BookInfo() {}
	
	public BookInfo(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getDcPrice() {
		return dcPrice;
	}

	public void setDcPrice(int dcPrice) {
		this.dcPrice = dcPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookInfo [name=" + name + ", price=" + price + ", dcPrice=" + dcPrice + "]";
	}
	

}
