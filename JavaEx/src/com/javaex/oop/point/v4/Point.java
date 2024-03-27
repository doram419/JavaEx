package com.javaex.oop.point.v4;

// point v4. 상속 연습

public class Point {
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	// 일반 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 지웠습니다.%n", x, y);
	}
	
	// 메서드 오버로딩
	public void draw(boolean draw) {
		String message = String.format("점[x = %d, y=%d ]을 ", x, y);
		
		message += draw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
	
	
}
