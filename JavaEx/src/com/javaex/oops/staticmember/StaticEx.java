package com.javaex.oops.staticmember;

public class StaticEx {
	public static int refCount; 	// 클래스 변수
	// -> 생성된 모든 인스턴스의 갯수
	public static String classVar; 	// 클래스 변수
	public String instanceVar;		// 인스턴스 변수
	
	// 스태틱 블록으로 클래스 변수 초기화
	
	static {
		refCount = 0;	// 스태틱 변수 초기화
		classVar = "Static Member";	// 클래스 변수 접근
		// instanceVar = "Instance Member";	// 스태틱 영역에서 인스턴스 변수로의 접근 불가.
		// static 영역에서는 static 영역만 접근 가능
		System.out.println("클래스 영역 초기화");
	}
	
	// 생성자
	public StaticEx() {
		// 인스턴스가 생성될 때, 객체 카운트를 증가
		refCount ++;
		//System.out.println("refCount:" + refCount);
		System.out.println("Instance 생성!");
	}
	
	// 소멸자
	// 자바에서 소멸자는 마음대로 불리는게 아닌.. 가비지 컬렉터가 알아서 하는거니까 권장하지 않는듯해
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		refCount--;
		// 객체가 소멸 될 때 참조 카운트 1개 줄임
		super.finalize();
		System.out.println("소멸자 호출");
	}

}
