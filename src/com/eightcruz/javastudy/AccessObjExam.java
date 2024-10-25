package com.eightcruz.javastudy;

import Training_package.AccessObj;

public class AccessObjExam extends  AccessObj{
	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		System.out.println(obj.p);
		System.out.println(obj.p2); //패키지 변경하면 접근 불가능, 상속받으면 접근 가능
		// System.out.println(obj.p3); private은 접근 불가능
		// System.out.println(obj.p4); //패키지 변경하면 접근 불가능
		
		
	}

}
