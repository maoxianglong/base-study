package com.mxl.study.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author user
 *
 */
public class TestMap2 {

	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		for (int i = 0; i < 11; i++) {
			map.put(((Integer)i).toString(), i);
		}
		
		map.put("a", "a");
		map.put("b", "b");
		
		Set<String> set = map.keySet();//遍历hashmap集合使用的是Entry或者KeySet，让后再使用迭代器
		
		Iterator<Entry<String, Object>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, Object> entry = (Entry<String, Object>) iterator.next();
			System.out.print(entry.getKey() + ":" + entry.getValue());
			System.out.println();
		}
	}
	
}
