package com.yedam.collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer("87"), "홍길동");
		scores.put(new Integer("98"), "이동수");
		scores.put(new Integer("75"), "박갈순");
		scores.put(new Integer("95"), "자바킴");
		scores.put(new Integer("80"), "스털링");
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.lastEntry();
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.lowerEntry(new Integer(90));
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.higherEntry(new Integer(90));
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.floorEntry(new Integer(90));
		System.out.println(entry.getKey() + " - " + entry.getValue());
		entry = scores.ceilingEntry(new Integer(90));
		System.out.println(entry.getKey() + " - " + entry.getValue());
	}
}
