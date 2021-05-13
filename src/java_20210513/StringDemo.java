package java_20210513;

public class StringDemo {
	public static void main(String[] args) {
		//character 배열로 string 만들수도 있다.
		char[] c= {'h','e','l','l','o'};
		String str = new String(c);
		System.out.println(str);
		str = new String(c,0,2);
		System.out.println(str);
		
		//문자열중에 특정 문자 하나만 반환하는 메서드
		//index는 0부터 시작
		char c1 = str.charAt(1);
		System.out.println(c1);
		
		//문자열 연결하는 메서드
		str = str.concat("123");
		System.out.println(str);
		
		//endsWith(String msg) => msg 문자열로 끝나면 true 그렇지 않으면 false
		str = new String("abc.zip");
		if(str.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		}else if(str.endsWith("doc")) {
			System.out.println("워드문서입니다.");
		}else {
			System.out.println("파일입니다.");
		}
		
		//startsWith(string msg) = > msg 문자열로 시작하면 true 그렇지 않으면 false
		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		//equals() => 문자열 비교, equalsIgnoreCase() => 대소문자 구분하지 않고 비교
		//주의 == 연산자는 객체를 비교하지, 안의 내용을 비교하지 않으므로 문자열이 같아도 false 를 반환.
		//trim() = > 앞뒤 공백 제거
		String m1 = new String(" hello ").trim();
		String m2 = new String("hello");
		if(m1.equals(m2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//getBytes() => 문자열을 byte 배열로 반환하는 메서드
		String m3 = new String("안녕하세요.");
		byte[] b = m3.getBytes();
		System.out.println(b.length);
		
		//indexOf() => 해당 문자열의 index(위치)를 처음부터 세서 int로 반환하는 메서드. index는 0부터 시작. 동일한게 있으면 가장앞에꺼 뽑아주는듯.
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);
		
		//lastIndexOf => 해당 문자열의 index를 처음부터 세서 int로 반환하는 메서드. 동일한게 있는데 가장마지막?
		String m5 = new String("a.b.c.zip");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);
		
		
		System.out.println(m4.substring(0,6)); // 0~6까지
		// =System.out.println(m4.substring(0,m4.indexOf("-"))); //공식스
		
		System.out.println(m4.substring(7)); //7~끝까지
		// =System.out.println(m4.substring(m4.indexOf("-")+1)); //공식이당.
		
		System.out.println(m5.substring(0,m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")+1));
		
		
		//ex) 010-1234-5678 -> 010,1234,5678 은 토큰(token) - 를 구분자(delimiter) 로 명칭한다.
		String m6 = new String("010-3033-9999");
		System.out.println(m6.substring(0,m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-")+1,m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-")+1));
	
		
		int a1 = Integer.parseInt(m4.substring(0,1)); //substring 뽑아온 1은 문자열이기때문에 int로 변경필요
		//cf. String m7 = 123+""; <= 문자열로 바꾸는 쉬운방법
		//String.valueof()는 primitive type을 String 으로 바꿔줌.
		String m7 = String.valueOf(123);
		
		
		//replaceAll("","") => 앞의 문자열을 뒤의문자열로 바꿔줌
		String m8 = m6.replaceAll("-", "*");
		System.out.println(m8);
		
		
		//upper = 대문자로, lower = 소문자로
		String m9 = new String("hello");
		String m10 = m9.toUpperCase();
		System.out.println(m10);
		String m11 = m10.toLowerCase();
		System.out.println(m11);
		
		
		//ex.-을 기준으로 문자열을 구분하면 문자열이 세개가 나오니까 String 배열에 담은것.
		String[] temp = m6.split("-");
		for(String value: temp) {
			System.out.println(value);
		}
		
		
		double d = 123454.678;
		String m12 = String.format("%,.2f", d);
		System.out.println(m12);
		//=System.out.format("%s",m13);
		//=System.out.format("%s",String.format("%,.2f", d));
		
		
	}
}
