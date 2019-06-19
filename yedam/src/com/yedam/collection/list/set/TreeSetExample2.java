package com.yedam.collection.list.set;

import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(80));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		System.out.println(scores.size());
		
		for(Integer i : scores) {
			System.out.println(i);
		}
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		score = scores.last();
		System.out.println("95점보다 높은 점수: " + score);
		score = scores.lower(new Integer(95));
		System.out.println("95점보다 낮은 점수: " + score);
		score = scores.higher(new Integer(95));
		System.out.println("95점 위 점수: " + score);
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);
		score = scores.ceiling(new Integer(95));
		System.out.println("95점이거나 바로 위의 점수: " + score);
		if(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은객체 수: " + scores.size()+")");
		}
	}
}
