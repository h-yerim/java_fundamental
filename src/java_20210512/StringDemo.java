package java_20210512;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));


		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));

		//문자열은 call by reference 여도 절대 변하지 않는다.
	}
}
