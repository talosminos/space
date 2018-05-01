package tk.wangyiwen.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import tk.wangyiwen.entity.Photo;
import tk.wangyiwen.entity.User;
import tk.wangyiwen.service.PhotoService;

public class PhotoAction extends ActionSupport {
	
	private List<File> listFile;
	private List<String> listFileFileName;
	
	private String currentAlbumId;
	private List<Photo> listPhoto;
	private PhotoService photoService;
	private String ImagePath;
	
	//显示照片
	public String show() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		String basePath = ServletActionContext.getServletContext().getContextPath();
		ImagePath = basePath +"/users/" + user.getUsername() + "/images/";
		System.out.println(ImagePath);
		Long albumID = Long.valueOf(currentAlbumId);
		listPhoto = photoService.fillAllByAlbumID(albumID);
		return "show";
	}
	
	//上传照片
	public String add() {
		System.out.println("------------------------"+currentAlbumId+"------------------------");
		try {
			Long albumID = Long.valueOf(currentAlbumId);
			photoService.addPhotos(listFile,listFileFileName,albumID);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String getCurrentAlbumId() {
		return currentAlbumId;
	}

	public void setCurrentAlbumId(String currentAlbumId) {
		this.currentAlbumId = currentAlbumId;
	}

	public List<Photo> getListPhoto() {
		return listPhoto;
	}
	public void setListPhoto(List<Photo> listPhoto) {
		this.listPhoto = listPhoto;
	}
	public PhotoService getPhotoService() {
		return photoService;
	}
	public void setPhotoService(PhotoService photoService) {
		this.photoService = photoService;
	}
	public String getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}
	public List<File> getListFile() {
		return listFile;
	}
	public void setListFile(List<File> listFile) {
		this.listFile = listFile;
	}
	public List<String> getListFileFileName() {
		return listFileFileName;
	}
	public void setListFileFileName(List<String> listFileFileName) {
		this.listFileFileName = listFileFileName;
	}
}
