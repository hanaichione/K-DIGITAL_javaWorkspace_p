
public class TestMain {

	public static void main(String[] args) {

		//AbstractClass x = new AbstractClass();
		ConcreteClass y =new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a();
		int n = y.b();
		y.c(200);	
		
		AbstractClass y2 =new ConcreteClass2();
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y2.b();
		y2.c(100);
	}

}
