package kosa.book;



public class Main {

	public static void main(String[] args) {
		BookInfo bookinfo1 = new BookInfo("Java",30000,22500);
		BookInfo bookinfo2 = new BookInfo("JSP",20000,16000);
		BookInfo bookinfo3 = new BookInfo("Oracle",15000,12750);
		
		int allPrice = (bookinfo1.getPrice() + bookinfo2.getPrice() + bookinfo3.getPrice());
		int allDcPrice = (bookinfo1.getDcPrice() + bookinfo2.getDcPrice() + bookinfo3.getDcPrice());
		System.out.println("총 가격: " + allPrice);
		System.out.println("총 할인 가격: " + allDcPrice);

	}

}
