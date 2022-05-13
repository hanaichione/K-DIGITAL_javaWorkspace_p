import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class MapTest9 {

	public static void main(String[] args) {
		
		//Properties 이용해서 시스템 환경변수 얻기
		Properties props=System.getProperties();
		
		Set<String> keys= props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"="+ props.getProperty(key));
		}
		
	}//end main

}
