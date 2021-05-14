package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList();
		//Generic : 특정 컬렉션에 원하는 자료형을 명시! 아래와 같이 쓴다.
		ArrayList<String> list = new ArrayList<String>(); // <-들어갈 데이터 String으로 넣어달라는것.
		list.add("1");
		list.add("2");
		list.add("3"); // 3도 들어는간다 <- auto-boxing (integer class가 들어가는 것) 매개변수가 object타입이기 때문.
		
		for(int i=0; i<list.size();i++) {
			//String value = (String)list.get(i); //정수는 여기서 에러남. String이 아니기때문(3을 넣었다면)
			String value = list.get(i); //generic 이기때문에 String 생략해도 됨
			System.out.println(value);
		}
		
		//출력이렇게도 가능.
		for(String value: list) {
			System.out.println(value);
		}
		
		
	}
}
