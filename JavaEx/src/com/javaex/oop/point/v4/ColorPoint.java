package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point{
	private String color;
	
	// 생성자
	public ColorPoint(String color) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 X
		super(0, 0);
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모 생성자 호출
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		super.draw();
	}
}
