package com.yedam.lch.extendPkg;
import java.util.Scanner;
class Earth{
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS; 
	}
}
public class EarthExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("지구의 반지름은: " + Earth.EARTH_RADIUS);
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA);
	}
}
