import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListTest5 {

	public static void main(String[] args) {
		
		//배열==> Arrays
		//컬렉션 ==> Collections
		
		TreeSet<String> s =
				new TreeSet<String>(Collections.reverseOrder());
		s.add("hello");
		s.add("aello");
		s.add("bello");
		s.add("xello");
		s.add("pello");
		
		System.out.println(s);
	}//end main

}
