package com.yedam;

public class Util {
	public static <T> Box<T> boxing(T value) {
		Box<T> box = new Box<T>();
		box.set(value);
		return box;
		
	}
}
