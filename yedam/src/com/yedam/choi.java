package com.yedam;

public class choi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor pf1 = new Professor(); //instance생성.
		pf1.setPrfNo("1234");
		pf1.setName("짱구");
		pf1.setMajor("englisg");
		System.out.println(pf1);
		
		System.out.println(pf1.getPrfNo());
		System.out.println(pf1.getName());
		System.out.println(pf1.getMajor());
		
		/*
		//생성자...
		Professor pf2 = new Professor("2222", "짱구", "캄캄캄");
		System.out.println(pf2);
		
		
		//배열
		//Professor[] prfAry = {pf1, pf2};
		Professor[] prfAry = new Professor[3]; 
		prfAry[0] = pf1;
		prfAry[1] = pf2;
		//prfAry[2] = null;
		for(int i=0; i<prfAry.length;i++) {
			System.out.println(prfAry[i]);
		}
		
		
		
		
		
		
		/*Student chs = new Student("120265", "최무겸", "컴퓨터응용기계");
			
			chs.setNum("120265");
			chs.setName("최무겸");
			chs.setMajor("컴퓨터응용기계");
			
			System.out.println(chs.getName());
			System.out.println(chs.getNum());
			System.out.println(chs.getMajor());
			*/
	}

}
