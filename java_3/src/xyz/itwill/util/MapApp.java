package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1000, "홍길동");
		map.put(2000, "임꺽정");
		map.put(3000, "전우치");
		map.put(4000, "일지매");
		map.put(5000, "장길산");

		System.out.println(map);

		map.put(2000, "임걱정");

		System.out.println(map);

		String name = map.get(1000);
		System.out.println(name);

		Iterator<Integer> iteratorKey = map.keySet().iterator();
		
		while (iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			String value = map.get(key);
			System.out.println(key + " = " + value);
//			System.out.println(iteratorKey.next() + " = " + map.get(key));
			
		}
		
		System.out.println("======================================");
		for(Integer key : map.keySet())
			System.out.println(key + " = " + map.get(key));

	}

}
