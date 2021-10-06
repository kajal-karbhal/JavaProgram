package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Python");
		nameList.add("C");
	}

}
