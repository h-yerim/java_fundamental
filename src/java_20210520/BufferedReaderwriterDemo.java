package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderwriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null; 
		
		try {
			fr = new FileReader("C에서 또 경로 긁어왕");
			br = new BufferedReader(fr);
			fw = new FileWriter("reader에서 긁어온거에 -copy 붙여서");
			bw = new BufferedWriter(fw);
			String readLine = null;
			while((readLine= br.readLine())!=null) {
				System.out.println(readLine); // readLine에는 개행이없기때문에 모니터에 출력시 ln 붙여서 쓴다.
				bw.write(readLine); //readLine 변수에는 개행을 포함 X
				bw.newLine(); //개행을 넣어준다.(window -> \r\n, unix -> \n 을 넣어줌)
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(fr != null) fr.close();
				if(br != null) br.close();
				
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
