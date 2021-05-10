package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char 리터럴 => 문자 표현법
		char c1 = '정';
		char c2 = '혜';
		char c3 = '림';
		//print 하면 가로로 출력되고 ln 붙이면 다음꺼가 세로로 출력됨
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);
		
		//char 리터럴 => 유니코드 표현법
		char c4 = '\uc815';
		char c5 = '\ud61c';
		char c6 = '\ub9bc';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		//char 리터럴 => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		//문자중에 사용할 수 없는 문자는 ',\ (escape character)
		//사용하기 위해서는 \를 사용해야 한다.
		char c10 = '\'';
		char c11 = '"';
		char c12 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		
		//특수문자 \t \n
		System.out.print("안녕하세요.\n저는 정혜림입니다.\n잘 부탁드립니다.\n");
		System.out.println("아이디\t이름\t지역");
		System.out.println("rim\t정혜림\t서울");
		
		
		
	}

}
