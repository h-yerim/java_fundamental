package java_20210520;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("대충 C에 있는 파일하나 경로긁어옴");
			fw = new FileWriter("똑같은파일에 -copy하나 더 붙여서",true); //true를 넣게되면 이어쓰기가됨
			/*
			int readChar = 0;
			//read() : 한 문자를 읽는다.
			while((readChar = fr.read())!= -1) { //-1이면 더이상 읽을게 없다는 뜻
				System.out.print((char)readChar); //모니터에 출력하는거
				//write(): 한개의 문자를 쓴다.
				fw.write(readChar);
			} */
			int readCharCount = 0;
			char[] readChars = new char[1024*8];
			
			while((readCharCount = fr.read(readChars))!=-1) {
				System.out.println(readChars);
				fw.write(readChars, 0, readCharCount); //0부터 읽은문자수(readCharCount)까지 출력
			}
			
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
