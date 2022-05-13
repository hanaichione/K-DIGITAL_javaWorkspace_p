
import java.util.Calendar;
import java.util.Random;

import com.yyy.Student;

public class TestStuent {

	public static void main(String[] args) {
		//1. 패키지 직접 명시 
		com.xxx.Student s = new com.xxx.Student();
		System.out.println(s.name);
		s.a();
		
		//2.  import 
		Student ss= new Student();		
		System.out.println(ss.name);
		
		Random r = new Random();		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}

}
