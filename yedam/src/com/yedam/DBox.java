package com.yedam;

public class DBox<L, R> {
	private L left;
	private R right;
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	public String toString() { return left + " & " + right;}
	
}
