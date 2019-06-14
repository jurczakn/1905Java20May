package com.revature.pojo;

public class Album {
	
	private int albumId;
	private String title;
	private int artistId;
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(int albumId, String title, int artistId) {
		super();
		this.albumId = albumId;
		this.title = title;
		this.artistId = artistId;
	}
	
}
