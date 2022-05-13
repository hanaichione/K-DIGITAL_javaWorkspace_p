package com.one;
import java.util.ArrayList;
import java.util.List;


class Person{}
class Man extends Person{}
class Woman extends Person{}
// <T><E><?> <? extends 클래스> <? super 클래스>
public class GenericTest3 {

	public static void printData(List<? extends Person>  num) {
		for (Object c : num) {
			System.out.println(c);
		}
	}
	public static void printData2(List<? super Man>  num) {
		for (Object c : num) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
	
		List<Man> list2 = new ArrayList<>();
		List<Woman> list3 = new ArrayList<>();
		List<Person> list4 = new ArrayList<>();
		List<String> list = new ArrayList<>();

		//printData(list);
		printData(list2);
		printData(list3);
		printData(list4);
		
	//	printData2(list);
		printData2(list2);
		printData(list3);
		printData2(list4);
	}//end main
}//end class
