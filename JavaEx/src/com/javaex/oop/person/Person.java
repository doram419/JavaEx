package com.javaex.oop.person;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 생성자");
		this.name = "Unknown";
		this.age = 0;
	}
	
	public Person(String name, int age)
	{
		System.out.println("Person 생성자");
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 %d%n"
				, name, age);
	}
}