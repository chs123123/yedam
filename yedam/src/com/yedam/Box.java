package com.yedam;

public class Box<T> {
	private T object;
	public void set(T object) {
		this.object = object;
	}
	public T get() {
		return object;
	}
	@Override
	public String toString() {
		return (String)object;
	}
	
}
//이런의미
//Box<String>{
//	private String object;
//	public void set(String object) {
//		this.object = object;
//	}
//	public String get() {
//		return object;
