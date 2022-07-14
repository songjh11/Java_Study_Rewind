package com.iu.s1;

public class Check {

	//인공지능
	//이력서 커트
	public boolean resumeCut(Resume r) {
		if(r.age>=40) {
//			System.out.println("불합격");
			r.check=false;
			return false;
		} else {
//			System.out.println("통과");
			r.check=true;
			return true;
		}
	}
}
