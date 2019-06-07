package com.oracle;
class Triangle {
	double height;
	double width;
	Triangle(){
	}
	Triangle(double a, double b){  // 초기값..
		height = a;
		width = b;
	}
	// 메소드 오버로딩...오버라이딩..
	double getArea() {
		if(height!=0 && width!=0)
			return height*width/2;
		else
			return 0.0;
	}
	double getArea(double a) {
		return a*a/2;
	}
	double getArea(double a, double b) {
		return a*b/2;
	}
}
public class TriangleEx {
	public static void main(String[] args) {
		Triangle tr = new Triangle(4,5);
		System.out.println(tr.getArea());
		System.out.println(tr.getArea(5));
		double result = tr.getArea(8,4);
		System.out.println(result);
	}
}
