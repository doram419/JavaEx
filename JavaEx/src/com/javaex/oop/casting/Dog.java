package com.javaex.oop.casting;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}	
	
	// 짖는다
	public void bark() {
		System.out.println(name + "멍멍~!");
	}
}
