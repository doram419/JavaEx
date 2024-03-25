package com.javaex.oop.goods.v3;

// v3
public class GoodsApp {
	public static void main(String[] args) {
//		Goods camera = new Goods();
		Goods camera = new Goods("nikon", 400_000);
		Goods laptop = new Goods("LG그램", 900_000);
		Goods cup = new Goods("머그컵", 2_000);
				
		// 메소드로 상품 정보 출력
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();
	}
}
