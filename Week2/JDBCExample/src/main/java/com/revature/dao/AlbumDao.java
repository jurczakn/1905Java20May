package com.revature.dao;

import java.util.List;

import com.revature.pojo.Album;

public interface AlbumDao {
	
	public void saveAlbum(Album a);
	
	public void updateAlbum(int albumId, Album a);
	
	public void deleteAlbum(Album a);
	
	public List<Album> getAllAlbums();
	
	public Album getAlbumById(int id);
	
	public List<Album> getAlbumByArtistId(int id);

}
