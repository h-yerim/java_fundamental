import java.util.*;

public class Practice {
	public static void main(String[] args) {
		System.out.print("당신의 주민번호를 입력하세요.");
		
		Scanner scn = new Scanner(System.in);
		String regNo = scn.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3' :
			System.out.println("당신은 남자입니다.");
			break;
			
		case '2' : case '4' :
			System.out.println( "당신은 여자입니다.");
			
		default:
			System.out.println("유효하지않은 주민번호입니다.");
		}
	}
}
