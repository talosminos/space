package tk.wangyiwen.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import tk.wangyiwen.entity.Photo;

public class PhotoDaoImpl implements PhotoDao{

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean add(Photo photo) {
		hibernateTemplate.save(photo);
		return true;
	}

	@Override
	public boolean delete(Photo photo) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 通过相册ID获取所有照片
	 */
	@Override
	public List<Photo> findAllbyAlbumId(Long albumId) {
		List<Photo> listPhoto = null;
		if (albumId != null) {
			String sql = "from Photo where album.albumId = ?";
			listPhoto = (List<Photo>) hibernateTemplate.find(sql, albumId);
		}
		return listPhoto;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
