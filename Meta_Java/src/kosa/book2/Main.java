// 강사님

package kosa.book2;

public class Main {
	
	public static void main(String[] args) {
		int allPrice = 0;
		int dc_totalPrice = 0;
		BookInfo arr[] = {
				new BookInfo("Java",30000),
				new BookInfo("JSP",20000),
				new BookInfo("Oracle",15000)
		};
		
		for(BookInfo b : arr) {
			b.discount();
			b.toString();
			allPrice += b.getPrice();
			dc_totalPrice += b.getDc_price();
		}
		
		System.out.println("총합: " + allPrice);
		System.out.println("할인 총합: " + dc_totalPrice);

	}

}
