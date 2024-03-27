package com.javaex.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy");
		// Upcasting : 부모 타입으로 자손 객체를 참조하는 것
		// 참조 타입에 설계된 것만 사용할 수 있다.
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();
		// 부모 설계도에 있는 것만 사용가능
	}
}
