package Collection;

import java.util.ArrayList;

public class VirtualCapacityArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar=new ArrayList<Object>(20);
		System.out.println(ar.size());
		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		

	}

}
