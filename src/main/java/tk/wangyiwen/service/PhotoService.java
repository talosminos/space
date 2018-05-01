package tk.wangyiwen.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.AlbumDao;
import tk.wangyiwen.dao.PhotoDao;
import tk.wangyiwen.entity.Album;
import tk.wangyiwen.entity.Photo;
import tk.wangyiwen.entity.User;

@Transactional
public class PhotoService {

	private PhotoDao photoDao;

	public List<Photo> fillAllByAlbumID(Long albumId) {
		return photoDao.findAllbyAlbumId(albumId);
	}

	public void setPhotoDao(PhotoDao photoDao) {
		this.photoDao = photoDao;
	}

	public void addPhotos(List<File> listFile,List<String> listFileFileName, Long currentAlbumId) throws IOException {

		/*
		Album currentAlbum = null;
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		Set<Album> setAlbum = user.getAlbumSet();
		for (Album album : setAlbum) {
			if (album.getAlbumId() == Long.valueOf(currentAlbumId)) {
				currentAlbum = album;
			}
		}
		*/
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		String basePath = ServletActionContext.getServletContext().getRealPath("/");
		String path = basePath + "users/" + user.getUsername() + "/images";
		// 把图片封装成Photo,并存储
		for(int i = 0 ;i<listFile.size();i++) {
			Photo photo = new Photo();
			photo.setPhotoName(listFileFileName.get(i));
			Album currentAlbum  =new Album();
			currentAlbum.setAlbumId(currentAlbumId);
			photo.setAlbum(currentAlbum);
			photoDao.add(photo);

			// 存储图片
			InputStream is = new FileInputStream(listFile.get(i));
			File destFile = new File(path, listFileFileName.get(i));
			OutputStream os = new FileOutputStream(destFile);
			byte[] buffer = new byte[400];
			int length = 0;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();
		}
	}

	public PhotoDao getPhotoDao() {
		return photoDao;
	}
}
