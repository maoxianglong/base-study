package com.mxl.context;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Object,Object> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");

        System.out.println(map.get(null));
    }

}
