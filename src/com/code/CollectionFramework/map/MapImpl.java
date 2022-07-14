package com.code.CollectionFramework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {
    public static void main(String[] args) {
       // Map<String,Integer>numbers=new HashMap<>();//O(1)
        Map<String,Integer>numbers=new TreeMap<>();  //O(logn)
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        System.out.println(numbers);  // to print all the numbers here and also store into the map.
        for(Map.Entry<String,Integer>e:numbers.entrySet()){
            e.getValue().equals(5);
            System.out.println(e);
        }
        for(String key:numbers.keySet())
            System.out.println(key);

        for(Integer num: numbers.values())
            System.out.println(num);
    }
}
