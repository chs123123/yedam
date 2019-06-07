package com.yedam.lch.extendPkg;

public class Television {
		static String company = "Google";
		static String browser = "Chrome";
		static String info;
		static {
			//초기값이 복잡한 계산식을 통해 이룰때 static에 초기값을 넣어준다
			info = company + "-" + browser;
		}
}
