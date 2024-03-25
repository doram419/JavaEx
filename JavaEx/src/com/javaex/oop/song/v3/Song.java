package com.javaex.oop.song.v3;

// v3. this 생성자

public class Song {
	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
		track = 0;
	}
	
	public Song(String title, String artist) {
		this();
		this.title = title;
		this.artist = artist;
	}
	
	public Song(String title, String artist, 
			String album, int year, 
			int track, String composer) {
		this(title, artist);
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	// getters/setters 
	public String getTitle() {
		return title;
	}
	
//	public void setTitle(String title) {
//		this.title = title;
//	}
	
	public String getArtist() {
		return artist;
	}
	
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
	
	public String getAlbum() {
		return album;
	}
	
//	public void setAlbum(String album) {
//		this.album = album;
//	}
	
	public String getComposer() {
		return composer;
	}
	
//	public void setComposer(String composer) {
//		this.composer = composer;
//	}
	
	public int getYear() {
		return year;
	}
	
//	public void setYear(int year) {
//		this.year = year;
//	}
	
	public int getTrack() {
		return track;
	}
	
//	public void setTrack(int track) {
//		this.track = track;
//	}
	
	public void showInfo()
	{
		System.out.printf("%s, %s ( %s, %d, %d번 track,"
				+ " %s 작곡)\n", getArtist(), getTitle(),
				getAlbum(), getYear(), getTrack()
				, getComposer());
	}
}
