package kosa.food;

public class Order {

	private Food food;
	private int amount;
	private int allPrice;
	
	public Order() {}

	

	public Order(Food food, int amount) {
		super();
		this.food = food;
		this.amount = amount;
		this.allPrice = amount*food.getPrice();
	}



	public Food getFood() {
		return food;
	}



	public void setFood(Food food) {
		this.food = food;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getAllPrice() {
		return allPrice;
	}



	public void setAllPrice(int allPrice) {
		this.allPrice = allPrice;
	}



	@Override
	public String toString() {
		return "음식 : " + food + ", 주문개수 : " + amount + ", 주문가격 : "+ allPrice;
	}
}
