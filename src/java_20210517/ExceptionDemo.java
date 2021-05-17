package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//java.lang.NumberFormatException 
		//1111자리에 1111a -> 예외처리를 해야함, 12.34 -> 코드를 변경해야 함.
		int i = Integer.parseInt("1111");
		System.out.println(i);
		
		//java.lang.NumberFormatException 
		double d= Double.parseDouble("12.34"); //12.34a 가 들어가면 예외발생
		System.out.println(d);
		
		// java.lang.ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어나면 발생하는 예외
		int[] a = {1,2,3,4};
		System.out.println(a[3]); //a[4]를 넣으면 예외발생
		
		// java.lang.IndexOutOfBoundsException 
		//collection에서 범위를 벗어나면 발생하는 예외
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(123); //auto-boxing
		System.out.println(list.get(0)); //(0자리에 1을 넣으면 length가 1일때 index는 0까지 밖에없기때문에 예외발생)
		
		// java.lang.NullPointerException
		// 객체를 생성하지 않고 메서드(length)를 사용하면 발생하는 예외
		String str = "hello"; //null이 들어가면 예외발생
		System.out.println(str.length());
		
		// java.lang.ArithmeticException
		int b = 10;
		int c = 0;
		System.out.println(b/c);
		
	}
}
