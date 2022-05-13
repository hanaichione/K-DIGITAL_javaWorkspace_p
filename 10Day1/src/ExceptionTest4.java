
public class ExceptionTest4 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		try {
			// 작업1
			int num = 10;
			int result = num / 1;
			System.out.println(result);

			// 작업2
			String name = "a";
			System.out.println(name.length());

			// 작업3==> 우리가 알고 있는 예외가 아니다.
			int[] num2 = { 10, 20 };
			System.out.println(num2[3]);

		} catch (NullPointerException e) {
			System.out.println("예외발생1" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("예외발생2" + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외발생3" + e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
