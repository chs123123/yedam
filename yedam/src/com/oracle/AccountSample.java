package com.oracle;

public class AccountSample {
	public static void main(String[] args) {
		Account acct = new Account("111-111","554887-5544875");
		//acct.acNumber = "1234-5678";
		//acct.ssNumber = "888552-8447789";
		acct.initAccount(10000);
		acct.checkBalance();
		acct.input(5000);
		acct.checkBalance();
		//Account acct2 = new Account();
		//acct2.checkBalance();
		
		
	}
}
