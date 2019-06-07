package com.yedam.chs;

public class println {
		public static void main(String[] args) {
			System.out.println("시작");
			println(3, "*", 10);
			System.out.println("종료");
		}
		//메소드 매개변수
		static void println(int num, String str, int num1) {
			String toStr="";
			for(int i=0; i<num; i++) {
				System.out.println(str);
					toStr += str;
		}
			for(int i=0; i<num; i++) 
				System.out.println(toStr);
}
}
