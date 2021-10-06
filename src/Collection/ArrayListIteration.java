package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList<String> studentList= new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Kartik");
		studentList.add("Steve");
		studentList.add("Lisa");
		
		//for loop
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i));
		}
		
		//for each loop
		for(String s:studentList) {
			System.out.println(s);
		}
		
		//Iterator
		Iterator<String> it= studentList.iterator();
	}
}
