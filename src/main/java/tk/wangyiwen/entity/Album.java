package tk.wangyiwen.entity;

import java.util.Set;

public class Album {

	/**
	 * 相册ID 
	 * 相册名称 
	 * 相册描述
	 * 封面图片(默认是没有)
	 * 所属用户
	 */
	private Long albumId;
	private String albumName;
	private String albumDescribe;
	private String coverImage = "none";
	private User user;
	private Set<Photo> photoSet;

	public Set<Photo> getPhotoSet() {
		return photoSet;
	}

	public void setPhotoSet(Set<Photo> photoSet) {
		this.photoSet = photoSet;
	}

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumDescribe() {
		return albumDescribe;
	}

	public void setAlbumDescribe(String albumDescribe) {
		this.albumDescribe = albumDescribe;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	
}
