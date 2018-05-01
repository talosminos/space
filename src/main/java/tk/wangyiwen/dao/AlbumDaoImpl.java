package tk.wangyiwen.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import tk.wangyiwen.entity.Album;
import tk.wangyiwen.entity.User;

public class AlbumDaoImpl implements AlbumDao{

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean add(Album album) {
		hibernateTemplate.save(album);
		return true;
	}

	@Override
	public boolean delete(Album album) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Album> findAllByUser(User user) {
		List<Album> listAlbum = null;
		if(user==null)
			return null;
		else {
			String queryString = "from Album where user.username=?";  
			listAlbum = (List<Album>) hibernateTemplate.find(queryString, user.getUsername());
			return listAlbum;
		}
	}

	@Override
	public Album findUserByName(String albumName) {
		// TODO Auto-generated method stub
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
