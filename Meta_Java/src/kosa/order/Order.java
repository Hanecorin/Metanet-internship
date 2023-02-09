package kosa.order;

public class Order {
	private int orderNo;
	private Member member;
	private Item item;
	private int quantity;
	private int amount;

	public Order() {
	}

	public Order(int orderNo, Member member, Item item, int quantity) {
		super();
		this.orderNo = orderNo;
		this.member = member;
		this.item = item;
		this.quantity = quantity;
		this.amount = item.getPrice()*quantity;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void show() {
		System.out.println("주문번호 : " + orderNo);
		System.out.println("회원이름 : " + member.getName());
		System.out.println("회원주소 : " + member.getAddress());
		System.out.println("주문한 상품 모델명 : " + item.getItem());
		System.out.println("주문한 상품 가격 : " + item.getPrice() + "원");
		System.out.println("주문수량 : " + quantity + "개");
		System.out.println("주문금액 : " + amount + "원");
	}

}
