package java_20210608;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//ctrl+shift+o : 자동 import 단축키
		File f = new File("C:\\dev\\test\\2021\\05\\18\\apache.zip");
		
		long len = f.length();
		System.out.printf("%dK %n",len/1024); //파일 크기를 kbyte로 출력
		
		String fileName = f.getName();	
		System.out.printf("%s %n",fileName);
	
		String name = fileName.substring(0,fileName.lastIndexOf(".")) ; //파일이름
		System.out.printf("%s %n",name);
		String extension= fileName.substring(fileName.lastIndexOf(".")+1); //파일확장자
		System.out.printf("%s %n",extension);
	
		String parentPath = f.getParent();
		System.out.printf("%s %n",parentPath);
		
		//File f2 = new File(parentPath,"apache."+extension); //파일이름 rename
		File f2 = new File(parentPath,System.currentTimeMillis()+"."+extension); //파일이름이 ms로 바껴있음-> 파일중복성관리위해 이렇게 많이쓴다.
		
		f.renameTo(f2); //실행시키면 파일이름 바껴있음
		
		
		
		
	
	}
}
