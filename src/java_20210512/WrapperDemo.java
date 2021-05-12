package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//ctl + shift + o  => 자동 import
		// 자바 1.4이전 버전에서는 primitive data type를 Collection에 저장할 수 없었기때문에 primitive data type을 객체화 할 수있는 Wrapper Class으로 변환하여 저장해야했다.
		//아래와 같이 1을 저장할 수 없음.
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class 변환 (valueOf(~))
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		
		//2. wrapper class => primitive data type(intValue())
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		
		int i5 = i3 + i4;
		
		//3. 숫자로 구성된 String => primitive data type 은 꼭 알아 둘것. (1,2번은 요즘 자동으로 됨)
		//Integer.parseInt("10");
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
		
		//4. auto-boxing : primitive data type -> wrapper class 로 자동변환
		Integer i7 = 100;
		Integer i8 = 200;
		
		//5. auto-unboxing : wrapper class -> primitive data type으로 자동변환
		int i9 = i7 + i8; //참조변수 2개를 더함(wrapper class) -> .intValue()가 생략되어있는것.
		
		
	}
}
