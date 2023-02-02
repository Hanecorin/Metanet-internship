// 강사님

package kosa.book2;

public class BookInfo {
	//상태 : 책이름, 정가, 할인된 가격
	//기능 : 할인된 가격 산출, 책 정보 출력
	
	private String name;
	private int price;
	private int dc_price;
	
	public BookInfo() {}
	
	public BookInfo(String name, int price) {
		super();
		this.name = name;
		this.price = price;
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

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}

	public void discount() {
		if (price >= 30000) {
			dc_price = (int)(price*0.75);
		}else if (price >= 20000) {
			dc_price = (int)(price*0.80);
		}else if (price >= 15000) {
			dc_price = (int)(price*0.85);
		}
	}
	
	public void printBook() {
		
	}
	
	
	

	@Override
	public String toString() {
		return "BookInfo [이름=" + name + ", 가격=" + price + ", 할인된가격=" + dc_price + "]";
	}
	
//	public void printBook() {
//		System.out.println("이름: " + name + "가격: " + price + "할인가격 : " + dc_price);
//		
//	}


}
