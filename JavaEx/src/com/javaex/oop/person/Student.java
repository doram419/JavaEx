package com.javaex.oop.person;

public class Student extends Person{
	private String schoolName;

	public Student(String name, int age, String schoolName) {
		super(name, age);
		System.out.println("Student 생성자");
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 학교 : %s%n"
				, super.getName(), super.getAge(),
				schoolName);	
	}
}
