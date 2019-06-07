
package com.yedam.lch.extendPkg;

public class UnivMan extends Man{
		String major;
		UnivMan(String major){
			super();
			this.major = major;
		}
		public UnivMan(String string, String string2) {
			// TODO Auto-generated constructor stub
		}
		public UnivMan() {
			// TODO Auto-generated constructor stub
		}
		public void tellYourUniv() {
			System.out.println("my major is " + major);
		}
		
		@Override
		public void tellYourName() {
			super.tellYourName();
			System.out.println("My major is " + major);
		
		}		
}
