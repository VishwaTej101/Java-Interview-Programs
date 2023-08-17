package HashMaps;

import java.util.*;

public class HashMap_basic {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(101, "data1");
		hm.put(102, "data2");
		hm.put(103, "data3");
		hm.put(104, "data4");
		
		hm.put(250, "data5");
		
		hm.remove(250);
		
		hm.put(111, null);
		hm.put(222, null);
		//multiple duplicate key values can't be made
		//however multiple duplicate value can be made
		
System.out.println(hm.containsKey(250));
System.out.println(hm.containsValue("data"));

System.out.println(hm.get(102));
System.out.println(hm.isEmpty());
hm.replace(250, "value");
System.out.println(hm.size());


		System.out.println(hm);

		for (Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + "->" + me.getValue());
		}
	}

}
