package com.javaex.oops.staticmember;

public class StaticExApp {
	
	public static void main(String[] args) {
		StaticEx[] statics = new StaticEx[3];
		
		statics[0] = new StaticEx();
		System.out.println("refCount:" + statics[0].refCount);

		statics[1] = new StaticEx();
		System.out.println("refCount:" + StaticEx.refCount);
		
		statics[2] = new StaticEx();
		System.out.println("refCount:" + StaticEx.refCount);
		
		statics[2] = null;
		System.out.println("s3 해제");
		System.out.println("refCount:" + StaticEx.refCount);
		System.gc(); // 가비지 컬렉터 호출
		
		try {
			Thread.sleep(3000);	// 3초 대기
			System.out.println("refCount:" + StaticEx.refCount);
		} 
		catch (Exception e) {

		}
	}
}
