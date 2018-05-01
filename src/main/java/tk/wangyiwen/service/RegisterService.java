package tk.wangyiwen.service;

import java.io.File;

import org.apache.struts2.ServletActionContext;
import org.springframework.transaction.annotation.Transactional;

import tk.wangyiwen.dao.UserDao;
import tk.wangyiwen.entity.User;

@Transactional
public class RegisterService {

	private File userFile;
	private UserDao userDao;

	public boolean register(User user) {
		/**
		 * 用户注册成功创建用户目录
		 */
		if (userDao.add(user)) {

			// 注册成功，创建用户目录
			 String basePath = ServletActionContext.getServletContext().getRealPath("/");
			//String basePath = "D:/wangyiwen";
			String path = basePath +"users/" + user.getUsername() + "/images";
			System.out.println(path);
			System.out.println(path);
			userFile = new File(path);
			userFile.mkdirs();
			return true;
		}
		return false;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
