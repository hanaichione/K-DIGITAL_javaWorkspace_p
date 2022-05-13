
public class TestStudent {
public static void main(String[] args) {
	Student s1= new Student();//기본생성자 호출  null, 0 ,null
	s1.setName("홍길동");
	s1.setAge(20);
	s1.setAddr("서울");
	String data= s1.getData();
	System.out.println(data);
}
}
