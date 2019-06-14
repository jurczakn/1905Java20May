package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.Album;
import com.revature.util.ConnectionFactory;

public class AlbumDaoPostgresImpl implements AlbumDao {
	
	private static Connection conn = ConnectionFactory.getConnection();

	@Override
	public void saveAlbum(Album a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAlbum(int albumId, Album a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAlbum(Album a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Album> getAllAlbums() {
		List<Album> albumList = new ArrayList<Album>();
		
		String sql = "select * from album";
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				albumList.add(new Album(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return albumList;
	}

	@Override
	public Album getAlbumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> getAlbumByArtistId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
