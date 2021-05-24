package java_20210524.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public void run() {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null; //streamreader는 한줄단위로 못읽으니가
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			//3. ip와 port로 서버에 접속을 시도한다.
			socket = new Socket(ip,port); //클라이언트의 이 socket과 서버(코드)에 있는 socket이 서로 통신하는 것임.
			System.out.println("서버와 접속이 성공...");
			//6. Socket을 이용해서 서버와 통신할 수 있는 입출력 스트림 생성
			//6-1
			OutputStream out = socket.getOutputStream(); //클라이언트가 서버한테 먼저 메세지보내니까 out 부터
			osw = new OutputStreamWriter(out); //2byte로(?)
			bw = new BufferedWriter(osw);
			bw.write("안녕하세요!");
			bw.newLine(); //개행(안넣어주면 서버에서 한줄을 못읽음)
			bw.flush(); //bufferedwriter는 반드시 flush 해줘야~
			//6-4
			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println("서버로부터 받은 메세지: "+readLine);		
			
		} catch (IOException e) {
			System.err.println("서버와 접속이 실패했습니다.");
		}
	}
	public static void main(String[] args) {
		//cmd => ipconfig 입력 => ipv4 주소 ip 위치에 입력(192.~)
		new EchoClient("192.168.0.72",3000).run();
	}
	
	
}
