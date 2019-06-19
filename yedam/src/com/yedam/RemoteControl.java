package com.yedam;

public interface RemoteControl {
		int MAX_VOLUME = 10; //대문자 표현
		int MIN_VOLUME = 0;
		//추상메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);

		//디폴드메소드
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음처리를 합니다.");
			}else {
				System.out.println("무음해제를 합니다.");
			}
		}
		//정적메소드
		static void changeBattery() {
			System.out.println("배터리를 교체합니다.");
		}
}
