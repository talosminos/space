package tk.wangyiwen.dao;

import java.util.List;

import tk.wangyiwen.entity.Photo;


public interface PhotoDao {

	public boolean add(Photo photo);
	public boolean delete(Photo photo);
	public List<Photo> findAllbyAlbumId(Long albumId);
	
}
