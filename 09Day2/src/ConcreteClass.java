
public  class ConcreteClass extends AbstractClass {

	public ConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a()===================");
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		System.out.println("b()===================");
		return 0;
	}

	@Override
	public String c(int x) {
		System.out.println("c()===================" + x);
		return null;
	}




//	@Override
//	public void a() {
//		System.out.println("A");
//	}
//
//	@Override
//	public int b() {
//		System.out.println("b");
//		return 0;
//	}
//
//	@Override
//	public void c(int x) {
//		System.out.println("c");
//	}

}
