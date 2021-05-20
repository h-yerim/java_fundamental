package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		//PrintStream 은 모든 자료형 출력가능
		PrintStream ps = null; // File(destination)
		PrintStream ps1 = null; // 모니터 (출력장치)

		ps1 = System.out;
		ps1.println("Hello");
		ps1.println("안녕하세요");

		try {
			fis = new FileInputStream(".zip");
			bis = new BufferedInputStream(fis);// stream chaining
			fos = new FileOutputStream(".zip");
			bos = new BufferedOutputStream(fos); // stream chaining

			// PrintStream
			// 1.PrintStream 의 메서드는 IOException 발생하지 않는다. (그래서 try, catch 안씀(?))
			// 2.auto flush 기능을 가지고있음. => 두번째 인자에 true라는 조건을 주면.

			ps = new PrintStream(bos, true); // stream chaining

			// 밑에 두줄이 핵심코드
			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				ps.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();

				if (fos != null)
					fos.close();
				if (ps != null)
					ps.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
