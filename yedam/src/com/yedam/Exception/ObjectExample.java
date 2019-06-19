package com.yedam.Exception;
class Const{
	String name;
	Const(String name) {
		this.name=name;
	}
}
class INum {
	private int num;
	private double age;
	private String str;
	
	public INum(int num, double age, String str) {
		this.num = num;
		this.age = age;
		this.str = str;
		
	}
	@Override
	public boolean equals(Object obj) {
		//if (this.age == ((INum) obj).age && this.num == ((INum) obj).num)
		if(this.str == ((INum) obj).str)
			return true;
		else
			return false;
}

}

public class ObjectExample {
	public static void main(String[] args) {
		INum num1 = new INum(10,12,"aaa");
		INum num2 = new INum(20,12,"bbb");
		INum num3 = new INum(10,13,"aaa");
		if(num1.equals(num2))
			System.out.println("num1, num2 동일함.");
		else
			System.out.println("num1, num2 다름.");
		if(num1.equals(num3))
			System.out.println("num1, num3 동일함.");
		else
			System.out.println("num1, num3 다름.");
	}
}