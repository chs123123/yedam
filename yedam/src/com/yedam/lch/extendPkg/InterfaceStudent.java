package com.yedam.lch.extendPkg;

public class InterfaceStudent implements InterfaceMan {
	String name;
	String phone;
	String sNo;
	@Override
	public void getInfo() {
		System.out.println("name = " + name + ", phone" + phone + ", sNo = " + sNo);
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}
class InterfaceProfessor implements InterfaceMan {
	String name;
	String phone;
	String pNo;
	@Override
	public void getInfo() {
		System.out.println("name = " + name + ", phone=" + phone + ", pNo = " + pNo);
		
	}

	@Override
	public String getName() {
		
		return name;
	}

}
