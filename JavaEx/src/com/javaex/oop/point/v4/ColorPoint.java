package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(String color) {
	}

	public ColorPoint(int x, int y, String color) {
	}
	
	@Override
	public void draw() {
		super.draw();
	}
}
