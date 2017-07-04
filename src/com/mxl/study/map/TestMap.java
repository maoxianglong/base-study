package com.mxl.study.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author user
 *
 */
public class TestMap {

	public static void main(String[] args) {
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		
//		map.put("one", "Mao");
//		map.put("two", "Xiang");
//		map.put("three", "Long");
		
		MapKey mapKeyone = new MapKey();
		MapKey mapKeytwo = new MapKey();
		MapKey mapKeythree = new MapKey();
		
		map.put(mapKeyone, "Mao");
		map.put(mapKeytwo, "Xiang");
		map.put(mapKeythree, "Long");
		
		System.out.println(mapKeyone.equals(mapKeytwo));
		
		for (Entry<Object, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("=========================");
		}
		
	}
	
}
