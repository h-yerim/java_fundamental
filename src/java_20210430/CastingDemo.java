package java_20210430;

public class CastingDemo {
	public static void main(String[] args) {
		//overflow 발생하여 컴파일 에러
		//byte b1 = 129;
		
		//circuit 발생(권장하지 않음)
		byte b1 = (byte)129;
		System.out.println(b1);
		
		//cut 발생
		int i1 = (int)129.25;
		System.out.println(i1);
		
		//auto-casting(자동 형변환)
		double d1 = 124.5f;
		System.out.println(d1);
		
		//산술연산자는 두 연산을 하고 결과를 int로 반환함 (ex.+) 따라서 byte끼리 덧셈시 형변환 필요
		//이것이 정수형 자료형의 경우 int를 많이 쓰는 이유, 산술연산자는 정수+정수여야함.
		
		byte b2 = 10;
		byte b3 = 20;
		//산술 연산자 '+'의 반환값은 int
		byte b4 = (byte)(b2+b3);
		int b5 = b2+ b3;
		
		System.out.println(b4);
		System.out.println(b5);
		
		//연결연산자
		//1. 문자열+숫자 => 문자열
		//2. 숫자+문자열 => 문자열
		//3. 문자열+문자열 => 문자열
		//2+3+"abc"="5abc", "abc"+2+3= "abc23", "abc"+(2+3)="abc5"
		
		String str1 = "abc"+1+2;
		String str2 = 1+2+"abc";
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
