import com.bank.Bank;

public class Test1 {
	public static void main(String[] args) {
		Bank b1= Bank.getBank();//4
		System.out.println(b1);
		Bank b2= Bank.getBank();//5
		System.out.println(b2);
		b1.setName("kb저축");
		System.out.println(b2.getName());
		
		
	}
}
