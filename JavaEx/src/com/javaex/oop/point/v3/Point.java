package com.javaex.oop.point.v3;

// point v3
// 메서드 시그니처 : 반환 타입, 이름은 같고
//               매개변수의 타입, 순서, 개수만 다른 메서드
public class Point {
	private int x;
	private int y;
		
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	public int getX() {
//		return x;
//	}
//	
//	public void setX(int x) {
//		this.x = x;
//	}
//	
//	public int getY() {
//		return y;
//	}
//	
//	public void setY(int y) {
//		this.y = y;
//	}
	
	// 일반 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 지웠습니다.", x, y);
	}
	
	// 메서드 오버로딩
	// boolean bDraw  -> true : 그렸습니다.
	//                -> "false" 면 지웠습니다.
	public void draw(boolean bDraw) {
		String message = String.format("점[x = %d, y=%d ]을 %n", x, y);
		
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}
	
	
}
