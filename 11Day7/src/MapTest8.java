import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MapTest8 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("one", "홍길동");
		prop.setProperty("two", "홍길동2");
		prop.setProperty("three", "홍길동3");
		
		String one =prop.getProperty("one");
		System.out.println(one);
		System.out.println(prop.getProperty("two"));
		System.out.println(prop.getProperty("three"));
		
	}//end main

}
