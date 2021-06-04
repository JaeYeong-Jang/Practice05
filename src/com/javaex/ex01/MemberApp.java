package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member01 = new Member();
		
		member01.setName("정우성");
		member01.setId("jws");
		member01.setPoint(50000);
		member01.showInfo();
		
		Member member02 = new Member();
		member02.setName("유재석");
		member02.setId("yjs");
		member02.setPoint(30000);
		member02.showInfo();
		
		Member member03 = new Member();
		member03.setId("lhr");
		member03.setName("이효리");
		member03.setPoint(40000);
		member03.showInfo();
		
	}

}
