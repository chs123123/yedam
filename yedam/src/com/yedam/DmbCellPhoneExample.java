package com.yedam;

class CellPhone {
	String model;
	String color;

	// 기본생성자 ... 매개값이 없는 생성자.
	CellPhone() {

	}

	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");

	}

	void sendVoice(String message) {
		System.out.println("자신:" + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방:" + message);
	}

	void handUp() {
		System.out.println("전화를 끊습니다.");
	}
	

}

class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone() {
	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모클래스의 생성자(arguemnts 2개인)
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel);
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을" + channel + "번으로 바꿉니다.");
	}

	void turnoffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	@Override
	void handUp() {
		System.out.println("Dmb 폰을 끊습니다.");
	}
}

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("SMT-300", "red", 10);
		dcp.bell();
		dcp.turnOnDmb();
		System.out.println(dcp.channel);
		dcp.changeChannelDmb(20);
		System.out.println(dcp.channel);
		dcp.turnoffDmb();
		dcp.handUp();
	}	
}
