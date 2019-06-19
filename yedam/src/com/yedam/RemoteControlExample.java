package com.yedam;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
		
		//익명 구현 객체
		RemoteControl rc1 = new RemoteControl() {
		
			int volume;
			@Override
			public void turnOn() {
				System.out.println("익명");
			}

			@Override
			public void turnOff() {
				System.out.println("익명이야");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("익명구현 볼륨은: " + volume);
			}
			
		};
		rc1.turnOn();
		RemoteControl.changeBattery();
	}
}
