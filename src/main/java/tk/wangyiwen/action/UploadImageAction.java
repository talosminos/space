package tk.wangyiwen.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadImageAction extends ActionSupport {
	private List<File> file;
	private List<String> fileFileName;
	private List<String> dataUrl;

	@Override
	public String execute() throws Exception {
		dataUrl = new ArrayList<String>();
		String imgpath = "upload/";
		for (int i = 0; i < file.size(); ++i) {
			InputStream is = new FileInputStream(file.get(i));
			String path = ServletActionContext.getServletContext().getRealPath("/");
			System.out.println(path);
			// String root = "D:\\";
			dataUrl.add(imgpath + this.getFileFileName().get(i));
			File destFile = new File(path + imgpath, this.getFileFileName().get(i));
			OutputStream os = new FileOutputStream(destFile);
			byte[] buffer = new byte[400];
			int length = 0;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();
		}
		return SUCCESS;
	}

	public List<String> getDataUrl() {
		return dataUrl;
	}

	public void setDataUrl(List<String> dataUrl) {
		this.dataUrl = dataUrl;
	}

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}
}
