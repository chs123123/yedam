package com.yedam.lch.extendPkg;

public class Vehicle {
	private String engine;
	private String handle;
	private String tire;
	
	Vehicle(){
		
	}
	Vehicle(String engine, String handle, String tire){
		this.engine = engine;
		this.handle = handle;
		this.tire = tire;
	}
	
	
	void start() {
		System.out.println("출발합니다.");
	}
	void run() {
		System.out.println("운행중입니다.");
	}
	void stop() {
		System.out.println("도착했습니다.");
	}
}
