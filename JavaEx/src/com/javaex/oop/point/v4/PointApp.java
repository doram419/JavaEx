package com.javaex.oop.point.v4;

//point v4
public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(5, 5);
		Point p2 = new Point(10, 23);
		
		p1.draw();
		p2.draw();
		
		// 오버로딩된 메서드 호출
		p1.draw(true);		// 그리기		
		p1.draw(false);		// 지우기
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		cp1.draw();
	}
}
