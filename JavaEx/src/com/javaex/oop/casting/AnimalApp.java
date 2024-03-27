package com.javaex.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy");
		// Upcasting : 부모 타입으로 자손 객체를 참조하는 것
		// 		자동 캐스팅
		// 참조 타입에 설계된 것만 사용할 수 있다.
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();
		// 부모 설계도에 있는 것만 사용가능
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// Downcasting : 명시적으로 타입을 지정
		// dog1을 bark() 하도록 해보자
		((Dog)(dog1)).bark();
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null; // ㅠㅠ.....
			//pet = new Cat("아즈라엘"); // 부모가 아닌 클래스에서는 참조 불가
		}
	}
}
