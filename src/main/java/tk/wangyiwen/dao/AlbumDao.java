package tk.wangyiwen.dao;

import java.util.List;

import tk.wangyiwen.entity.Album;
import tk.wangyiwen.entity.User;;

public interface AlbumDao {

	public boolean add(Album album);
	public boolean delete(Album album);
	public Album findUserByName(String albumName);
	public List<Album> findAllByUser(User user);
	
}
