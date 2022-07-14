package com.iu.s1;

public class S1Main {

	public static void main(String[] args) {
		//프로그램 생각
		//현실->digital
		//음식 주문 
		//Java
		//Data를 담는 기능을 하는 클래스, Function 어떤 기능을 실행하는 클래스
		//이력서: 이름, 전화번호, 나이, 주소
		//Java에서 출력을 하겠다는건 객체를 생성하겠다는 뜻
		Resume r = new Resume();
		Resume r2 = new Resume();
		r.name="song";
		r2.name="mong";
		
		Check check = new Check();
		Check check2 = new Check();
		
		check.resumeCut(r2);
		//check2.resumeCut(r);
		
		
		
		System.out.println();
		
	}

}
