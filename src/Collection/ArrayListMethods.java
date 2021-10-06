package Collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("Java");
		ar1.add("HTMl");
		ar1.add("C");
		ar1.add("PHP");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev Ops");
		
//		ar1.addAll(ar2);
//		System.out.println(ar1);
//		
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);
//		
//		ar1.clear();
//		System.out.println(ar1);
	
		ArrayList<String> cloneList= (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.contains("C"));
		
		System.out.println(ar1.indexOf("PHP")>0);
	}

}
