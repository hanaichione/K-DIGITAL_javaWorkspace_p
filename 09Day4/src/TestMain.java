
public class TestMain {

	public static void main(String[] args) {
		
		//A a = new A();
		System.out.println(A.NUM);
		//A.NUM =10;
		ConcreteClass t = new ConcreteClass();
		//System.out.println(c.NUM);
		t.a();
		t.b();
		t.c();
		A.d();//static 
		A tt= new ConcreteClass(); //다형성 
		tt.a();
		
	}

}
