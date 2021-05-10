package java_20210503;

public class SwitchDemo {
	public static void main(String[] args) {
		// 밑의 구문때문에 실행시 Run Configurations => Arguments => Program Arguments에 입력해서 실행
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		//12~2까지 실행할 문장이 같으니까 case 12: (비움) case 1: (비움) case 2: season = "겨울"; break; 로 해도 똑같은 결과를 얻을 수 있다.
		//버전이 업그레이드 되면서 case 12,1,2 :season = "겨울", break; <-요렇게도 가능해졌다. 하지만 case 수식에 들어가는 값은 중복불가.
		case 12:
			season = "겨울";
			break;
		case 1:
			season = "겨울";
			break;
		case 2:
			season = "겨울";
			break;
		case 3:
			season = "봄";
			break;
		case 4:
			season = "봄";
			break;
		case 5:
			season = "봄";
			break;
		case 6:
			season = "여름";
			break;
		case 7:
			season = "여름";
			break;
		case 8:
			season = "여름";
			break;
		case 9:
			season = "가을";
			break;
		case 10:
			season = "가을";
			break;
		case 11:
			season = "가을";
			break;
		default: 
			season = "없는 계절";

		}
		System.out.println(month + "월은 " + season + " 입니다.");
	}
}
