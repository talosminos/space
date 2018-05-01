package tk.wangyiwen.test;

import java.io.File;

import org.junit.Test;

public class CreateFile {

	public void createFile() {
		File newFile = new File("D://wangyiwen");
		newFile.mkdir();
	}
}
