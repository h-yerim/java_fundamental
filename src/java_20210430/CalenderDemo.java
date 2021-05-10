package java_20210430;

public class CalenderDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일이고, 윤년은 366일-> 2월29일 3. 윤년은 4년마다 발생하고 그중에서
		 * 100배수는 제외하고 400배수는 제외하지 않는다. 4. 2021년 4월 30일은 무슨요일 일까요? 힌트) 2020년까지 총일수,
		 * 1-3월까지 총일수, 30을 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일, ..., 7이면 일요일
		 */
        
		// Calender 과제 배열까지 넣은 수정본
				int year = 2024;
				int month = 5;
				int day = 4;

				int totalCount = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
				int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				boolean isLeafYear = (year%4==0 && year%100 !=0) || year%400==0;
				if(isLeafYear) {
					monthArray[1] = 29;
				}
				// 3월까지의합 (totalCount+31+28+31)
				for(int i = 0; i < month-1; i++) {
					totalCount += monthArray[i];
				}
				// = totalCount += 31+28+31;
				
				// 2021년 4월의 일수 더함
				totalCount += day; 

				int dayOfWeek = totalCount % 7;
				
				String message = "";
				if (dayOfWeek == 1) {
					message = "월요일";
				} else if (dayOfWeek == 2) {
					message = "화요일";
				} else if (dayOfWeek == 3) {
					message = "수요일";
				} else if (dayOfWeek == 4) {
					message = "목요일";
				} else if (dayOfWeek == 5) {
					message = "금요일";
				} else if (dayOfWeek == 6) {
					message = "토요일";
				} else if (dayOfWeek == 0) {
					message = "일요일";
				}
				
				System.out.printf("%d년 %d월 %d일 %s입니다.",year,month,day,message);
		
		
		/* 내가 짠 코드
		int year = 2021;
		int month = 4;
		int day = 30;
		int a = 2020 * 365;
		int n_year = 2020 / 4 - 2020 / 100 + 2020 / 400;

		int today = (a + n_year + 31 + 28 + 31 + 30) % 7;
		if (today == 1) {
			System.out.println(year + "년" + month + "월" + day + "일은 월요일입니다.");
		} else if (today == 2) {
			System.out.println(year + "년" + month + "월" + day + "일은 화요일입니다.");
		} else if (today == 3) {
			System.out.println(year + "년" + month + "월" + day + "일은 수요일입니다.");
		} else if (today == 4) {
			System.out.println(year + "년" + month + "월" + day + "일은 목요일입니다.");
		} else if (today == 5) {
			System.out.println(year + "년" + month + "월" + day + "일은 금요일입니다.");
		} else if (today == 6) {
			System.out.println(year + "년" + month + "월" + day + "일은 토요일입니다.");
		} else if (today == 0) {
			System.out.println(year + "년" + month + "월" + day + "일은 일요일입니다.");
		} else
			return;
		*/	

	}

}


