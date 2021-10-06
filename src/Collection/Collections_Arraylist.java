package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections_Arraylist {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add(100);
		ar.add("Teating");
		ar.add(13.44);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		ar.add('c');
		ar.add(true);
		System.out.println(ar.size());
		System.out.println("LI= "+0);
		System.out.println("HI= "+(ar.size()-1));
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(number);
		
		ArrayList<String> name=new ArrayList<String>(Arrays.asList("Java","Python","c#","PHP"));
		System.out.println(name);
		System.out.println(name.size());
	}
}
