package com.yedam;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.set(new String("hello"));
		String str = box.get();
		box.set("hl");
		
		Box<Integer> ibox = new Box<Integer>();
		ibox.set(new Integer(10));
		Integer inum = ibox.get();
		
		Box<Double> dbox = new Box<Double>();
		dbox.set(20.2);
		Double inum1 = dbox.get();
	}
}
