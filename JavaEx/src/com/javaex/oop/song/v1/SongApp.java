package com.javaex.oop.song.v1;
// 필드, getter/setter, 일반 메서드
public class SongApp {
	public static void main(String[] args) {
		Song cIU = new Song();
		Song cBig = new Song();
		Song cBusker = new Song();
		
		cIU.setArtist("아이유");
		cIU.setTitle("좋은날");
		cIU.setAlbum("좋은날");
		cIU.setYear(2010);
		cIU.setTrack(3);
		cIU.setComposer("이민수");
		
		cBig.setArtist("BIGBANG");
		cBig.setTitle("거짓말");
		cBig.setAlbum("Always");
		cBig.setYear(2007);
		cBig.setTrack(2);
		cBig.setComposer("G-DRAGON");
		
		cBusker.setArtist("버스커버스커");
		cBusker.setTitle("벚꽃엔딩");
		cBusker.setAlbum("버스커버스커1집");
		cBusker.setYear(2012);
		cBusker.setTrack(4);
		cBusker.setComposer("장범준");
		
		cIU.showInfo();
		cBig.showInfo();
		cBusker.showInfo();
	}
}
