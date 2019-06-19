package com.yedam;
class Product<T, M>{
	private T kind;
	private M model;
	public void setKind(T kind) { 
		this.kind = kind;
	}
	public T getKind() {
		return kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public M getModel() {
		return model;
	}
}
class Pair<K, V>{
	private K field1;
	private V field2;
	public void setValue(K a, V b) {
		field1 = a;
		field2 = b;
		
	}
	public V getValue() {
		return field2;
	}
	
	
}
public class MultiGeneric {
	public static void main(String[] args) {
		Product<Integer, String> p1 = new Product<Integer, String>();
		p1.setKind(10);
		p1.setModel("model");
		Integer i1 = p1.getKind();
		String s1 = p1.getModel();
		System.out.println(i1+","+s1);
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("BMW");
		Car c1 = p2.getKind();
		String s2 = p2.getModel();
		//////////////////////////////////////////////////
		Pair<String, String> pair = new Pair<String, String>();
		pair.setValue("test", "answer");
		String str = pair.getValue(); // answer
		System.out.println();
		Pair<String, Integer> inPair = new Pair<String, Integer>();
		intPair.setValue("test2" , 30);
		Integer intNum = pair.getValue();//30
		System.out.println();
	}
}
