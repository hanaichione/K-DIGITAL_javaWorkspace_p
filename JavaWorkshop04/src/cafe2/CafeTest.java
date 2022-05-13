package cafe2;

public class CafeTest {

	public static void main(String[] args) {
		//Cafe cafe= new Cafe();
		Cafe cafe= Cafe.getCafe();
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("아메리카노", 1000));
		cafe.setCoffeList(new Coffee("라떼", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		cafe.setCoffeList(new Coffee("블루베리", 1000));
		System.out.println(cafe.totalPrice());
		Coffee[] arr= cafe.getCoffeList();
		for (Coffee coffee : arr) {
			System.out.println(coffee);
		}
		System.out.println("=====================");
		Cafe cafe2= Cafe.getCafe();
		Coffee[] arr2= cafe.getCoffeList();
		for (Coffee coffee : arr2) {
			System.out.println(coffee);
		}

	}

}
