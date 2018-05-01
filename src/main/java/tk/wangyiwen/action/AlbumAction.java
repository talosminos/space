package tk.wangyiwen.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tk.wangyiwen.entity.Album;
import tk.wangyiwen.entity.User;
import tk.wangyiwen.service.AlbumService;;

public class AlbumAction extends ActionSupport {

	private List<Album> listAlbum;
	private AlbumService albumService;
	private String albumName;
	private String albumDescribe;
	private Album album;
	
	public String show() {
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		listAlbum = albumService.fillAllByUser(user);
		return "show";
	}
	
	public String add() {
		
		//把jsp网页中的信息赋值到属性中
		album = new Album();
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		album.setAlbumName(albumName);
		album.setAlbumDescribe(albumDescribe);
		album.setCoverImage("none");
		album.setUser(user);
		
		//添加相册业务
		albumService.add(album);
		
		return SUCCESS;
	}
	@Override
	public String execute() throws Exception {
		//获取相册列表
		return SUCCESS;
	}
	
	
	public List<Album> getListAlbum() {
		return listAlbum;
	}
	public void setListAlbum(List<Album> listAlbum) {
		this.listAlbum = listAlbum;
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
	public AlbumService getAlbumService() {
		return albumService;
	}
	public void setAlbumService(AlbumService albumService) {
		this.albumService = albumService;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
}
