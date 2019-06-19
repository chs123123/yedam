package com.yedam;

class Pairs<K, V> {
	private K key;
	private V value;

	public Pairs(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

class Utils {
	public static <K, V> <V> getValue(Pair<K,V> p, K) {

	}

	public static <T extends Number> int compare(T t1, T t2) {
		double v1 =  t1.doubleValue();
		double v2 =  t2.doubleValue();
		return Double.compare(v1, v2); // v1,v2 비교해서 -1,0,1
	}
}

public class BoxingMethodExmaple {
	public static void main(String[] args) {
		int result = Utils.compare(10, 20);
		System.out.println(result);
	}
}

/*
 * Box<Integer> box = Util.boxing(new Integer(200));
 * System.out.println(box.get());
 * 
 * Box<String> boxStr = Util.boxing(new String("hello"));
 * System.out.println(boxStr);
 */
/*
 * Pairs<Integer, String> p1 = new Pairs<Integer, String>(1,"aa");
 * Pairs<Integer, String> p2 = new Pairs<Integer, String>(1,"aa"); boolean
 * result = Utils.compare(p1, p2); if(result) {
 * System.out.println("동일한 객체입니다."); }else {
 * System.out.println("동일한 객체가 아닙니다.");
 */