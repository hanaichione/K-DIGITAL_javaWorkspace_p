package com.one;
import java.util.ArrayList;
import java.util.List;

// <T>,<E>,<?>
public class GenericTest2 {

	public static void printData(List<?>  num) {
		for (Object c : num) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		printData(list);
		printData(list2);
		
	}//end main
}//end class
