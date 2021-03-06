
public class ExceptionTest6 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		int num=0;
		try {
			// 작업1
			 num = 10;
			int result = num / 2;
			System.out.println(result);

			// 작업2
			String name = "aa";
			System.out.println(name.length());

			// 작업3==> 우리가 알고 있는 예외가 아니다.
			int[] num2 = { 10, 20 };
			System.out.println(num2[1]);

		} catch (NullPointerException e) {
			System.out.println("예외발생1" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("예외발생2" + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외발생3" + e.getMessage());
		}finally {
			System.out.println("반드시 수행되는 문장");
		}
		System.out.println(num);
		System.out.println("프로그램 종료");
	}
}
