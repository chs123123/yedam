package com.oracle;

public class Account {
	//필드
	int balance;
	private String acNumber;//계좌번호 243-3234-
	private String ssNumber;//주민번호 "student"
	//생성자(Constructor)
	Account(){
	}
	
	Account(String ac, String ss){
		acNumber = ac;
		ssNumber = ss;

	}
	
	void initaccount(int amt) {
		balance = amt;
	}
	//메소드
	void withdraw(int amt) { //인출기능
		balance = balance - amt;
		
	};
	void input(int amt){ //  입금기능
		balance = balance + amt;

	}
	public void checkBalance() {
		System.out.println("잔액은 : " + balance);
		
	};

}
