package com.yedam.lch.extendPkg;
public class BusineseMan extends Man {
	String company;
	BusineseMan(){
		super();
	}
	BusineseMan(String company){
		this.company = company;
	}
	BusineseMan(String name, String company) {
		super(name);
		this.company = company;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
	}
	@Override
	public void tellYourName() {
		super.tellYourName();
		System.out.println("My company " + company);
	}

}
