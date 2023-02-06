package kosa.order;

public class Item {
	private String item;
	private int price;
	
	public Item () {}

	public Item(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("주문한 상품 모델명 : " + item);
		System.out.println("주문한 상품 가격 : " + price);
	}
}
