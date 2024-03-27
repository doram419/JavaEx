package com.javaex.oop.casting;

public class Animal {
	// 필드
	protected String name;
	
	public Animal() {
		name = "default";
	}
	
	// 생성자
	public Animal(String name)
	{
		this.name = name;
	}
	
	// 메서드
	public void eat() {
		System.out.println(name + "이 먹고 있다.");
	}
	
	// 걷는다
	public void walk() {
		System.out.println(name + "은 산책 중...");		
	}
}
