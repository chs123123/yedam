package com.yedam.Exception;

public class NullpointerEx {
	public static void main(String[] args) {
		String data = "Hello";
		data = null;
		try {
			System.out.println(data.toString());
		}catch (NullPointerException e) {
			System.out.println("참조할 값이 없습니다.");
		}finally {
			System.out.println("확인하시고 다시 실행하세요.");
		}
		
	}
}
