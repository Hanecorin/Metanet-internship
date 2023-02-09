package kosa.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class OrderManager {

	public void list() {
		Map<Order,Integer> order = new HashMap<Order,Integer>();
		ArrayList<Map> orderSheet = new ArrayList<Map>(); // Queue 자료구조
		LinkedList<Map> orderProcess = new LinkedList<Map>(); // Queue 자료구조
		
		Food food1 = new Food("김치찌개" ,2000);
		Food food2 = new Food("된장찌개" ,4000);
		Food food3 = new Food("고추장찌개" ,3000);
		Order order1 = new Order(food1,2);
		Order order2 = new Order(food2,3);
		Order order3 = new Order(food3,2);
		
		
//		System.out.println(order1);
//		System.out.println(order2);
//		System.out.println(order3);
		order.put(order1,3);
		order.put(order2,2);
		order.put(order3,1);
		
		orderSheet.add(order);
		
		orderProcess.offer(order);
		
		Set set = order.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Order,Integer> e = (Map.Entry<Order, Integer>)iter.next();
			System.out.println("Key: " + e.getKey() + ", value: " + e.getValue());
		}
		
//		System.out.println("===========");
//		System.out.println(order);
//		System.out.println("===========");
//		
//		
//		
//		
//		System.out.println("---Queue---");
//		while (!orderProcess.isEmpty()) {
//			System.out.println(orderProcess.poll());
//			System.out.println("====");
//		}
//		
//		System.out.println(orderProcess);
	}
	
}
