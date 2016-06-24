package com.orilore.servlets;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class HomeWork {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 100);
		map.put(2, 119);
		map.put(3, 120);
		Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
	
			
			System.out.println("Ñ§ºÅ:"+key+"³É¼¨£º"+value);
		}
	
	}

}
