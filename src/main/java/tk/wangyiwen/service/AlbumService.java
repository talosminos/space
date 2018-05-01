package tk.wangyiwen.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.AlbumDao;
import tk.wangyiwen.entity.Album;
import tk.wangyiwen.entity.User;

@Transactional
public class AlbumService {

	private AlbumDao albumDao;
	public boolean add(Album album) {
		albumDao.add(album);
		return true;
	}
	public List<Album> fillAllByUser(User user) {
		return albumDao.findAllByUser(user);
	}
	public AlbumDao getAlbumDao() {
		return albumDao;
	}
	public void setAlbumDao(AlbumDao albumDao) {
		this.albumDao = albumDao;
	}
	
}
