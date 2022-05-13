
public abstract class AbstractClass {

	private int num;

	//추상 메서드
	public abstract void a();   //추상함수 : {} 없고, abstract, 자식에서 오버라이딩 강제 함
	public abstract int b();
	public abstract String c(int x);
	
	
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbstractClass(int num) {
		super();
		this.num = num;
	}
	
	
	
}
