package com.one;
import java.util.Date;

// Object대신에 T (Type)의미로서 참조형 타입만 지정 가능
// T는 Box객체를 생성할때 구체적인 타입으로 변경가능하다는것을 알려줌.
class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj =obj;
	}
	public T getValue() {
		return obj;
	}
}//end Box
public class GenericTest1 {

	public static void main(String[] args) {
		// 제네릭스 타입(generics type)
		Box<String> b = new Box<String>();
		b.setValue("hello");
		String x =b.getValue();
		//Date xx =(Date)b.getValue();
		System.out.println(x);
		Box<Date> b2 = new Box<>();
		b2.setValue(new Date());
		Date d = b2.getValue();
		System.out.println(d);
		
		Box<Integer> b3 = new Box<>();
		b3.setValue(100);
		//b3.setValue("100");
		int xxx = b3.getValue();
		System.out.println(xxx);
	}

}
