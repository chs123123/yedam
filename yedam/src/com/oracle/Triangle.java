package com.oracle;

public class Triangle {
	double width;
	double height;

	Triangle() {
	}

	Triangle(double a, double b) {
		height = a;
		width = b;
		
	}
		
	double getArea() {
		if (height != 0 && width != 0);
			return height * width / 2;
	}

	double getArea(double a) {
		return a * a / 2;
	}

	double getArea(double a, double b) {
		return a * b / 2;
	}
}
