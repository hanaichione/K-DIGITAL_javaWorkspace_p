import java.util.Comparator;

public class PersonAgeSortComparator
implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int num = -1;  // -1
		if(o1.getAge() > o2.getAge()) {
			num= 0;  //0  -내림차순 0, -1  오름차순 -1, 0
			
		}
		return num ;
	}

}
