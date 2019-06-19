package com.yedam.Exception;
class Const{
	String name;
	Const(String name){
		this.name=name;
	}
}
class Point{
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	
	}
	@Override
	public boolean equals(Object obj) {
		if(this.xPos == ((Point) obj).xPos && this.yPos == ((Point) obj).yPos);
			return true;
		
				
	}
}
public class EqualObject {
	public static void main(String[] args) {
		Point xPos1 = new Point(1, 0);
		Point yPos1 = new Point(2, 0);
	}
}
