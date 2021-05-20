package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		
		/* 1byte로 받는것(?) byte 단위로 입력받는 경우. byte는 보통 monitor로 굳이 출력시키지않는다.
	    InputStream in = System.in; //source가 키보드인 경우
		byte[] b = new byte[100];
		
		int readByteCount = 0;
		System.out.print("입력하세요>");
		while((readByteCount = in.read(b))!=-1) {
			String message = new String(b,0,readByteCount);
			if(message != null && message.trim().equals("quit")) break; //trim이 \r \n 제거
			System.out.print(message); //처음부터 읽은수만큼만 문자열 만들어줌(이때 \r, \n 포함되어있어 개행할필요 X)			
			System.out.print("입력하세요>");
		}
		*/
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in); //2byte로 읽기(?) 아마 char로 입력받을때 이방법을 쓰는듯
		BufferedReader br = new BufferedReader(isr); //한줄단위로 읽기위해서 다시 정의
		
		FileWriter fw = new FileWriter("C:\\Users\\user\\message.txt",true); //이 경로에 내가 입력한 것들 txt 파일로 저장하겠다. (출력을 파일로하는것)
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		String readLine = null;
		System.out.print("입력하세요>");
		while((readLine = br.readLine()) != null) {
			if(readLine != null && readLine.equals("quit")) break; //끝에 개행이 안붙었기때문에 trim 안써도된다.
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
			System.out.println("입력하세요>");
		}
		bw.flush();
	
	}
}
