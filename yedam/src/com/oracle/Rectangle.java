package com.oracle;

public class Rectangle {
	double height;
	double widht;

	Rectangle() {
	}

	Rectangle(double a, double b) {
		height = a;
		widht = b;
	}

	double getArea() {
		if (height != 0 && widht != 0)
			return height * widht / 2;
		else
			return 0;
	}

	double getArea(double a) {
		return a * a / 2;
	}

	double getArea(double a, double b) {
		return a * b / 2;
	}
}
