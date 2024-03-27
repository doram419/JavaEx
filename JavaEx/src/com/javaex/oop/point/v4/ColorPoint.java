package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(String color) {
		//super(0, 0);
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	public void draw() {
		super.draw();
	}
}
