package kosa.order;



public class Main {

	public static void main(String[] args) {
		
		Member member1 = new Member("한예찬","안양");
		Item item1 = new Item("갤럭시23",100);
		Order order1 = new Order(1,member1,item1,10,1000);
		
		
		
		
		
//		item1.setItem("갤럭시23");
//		item1.setPrice(100);
//		
//		order1.setOrderNo(1);
//		order1.setMember(member1);
//		order1.setItem(item1);
//		order1.setQuantity(10);
//		order1.setAmount(order1.getQuantity()*order1.getItem().getPrice());
		
		order1.show();
	}


}
