package java_20210507;

public class Calendar {
	//공통된 지역변수 뺴서 전역변수로 만듦. 굳이 공개할 이유없으니 private 설정
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
	public static final int MONDAY = 1;//final 이니까 public 으로 공개해도됨
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	
	private boolean isLeafYear(int year) {
		return (year%4==0 && year%100 !=0) || year%400==0;
	}
	
	private int getCount(int year, int month, int day) {
		int totalCount = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		
		boolean isLeafYear = isLeafYear(year);
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		for(int i = 0; i < month-1; i++) {
			totalCount += monthArray[i];
		}
		
		totalCount += day; 
		
		return totalCount;
	}

	
	public void print(int year, int month, int day) {
		
		int totalCount = getCount(year,month,day);

		int dayOfWeek = totalCount % 7;
		
		String message = "";
		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";
		}
		
		System.out.printf("%d년 %d월 %d일 %s입니다.",year,month,day,message);
		
	}
	
	public void print(int year, int month) {
		System.out.println(year+"년"+month+"월 달력입니다.");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//탭만큼 띄어쓰기 해야한다.
		//ex) 2021년 5월 달력 출력하기 위해서는 2021년 5월 1일까지의 총일수를 구한다음 7로 나눈 나머지 만큼 띄어쓰기하면됨.
		
		int totalCount = getCount(year,month,1); //5월 1일날 날짜를 구하는거기때문에 day는 1로 고정.
		int rest = totalCount % 7 ; //ex) 2021년 5월1일은 토요일(6)
		//int count = 0;
		for(int i=0; i<rest; i++) {
			System.out.print("\t");
			//count ++; (공백띄운 것까지 다 세주는것)
		}
		
		for(int i=1; i<=monthArray[month-1];i++) {
			System.out.print(i+"\t");
			//rest 대신 count %7 ==0 으로 개행도 가능.
			if(rest%7==6) System.out.println(); //토요일일때 개행을 하는 것.
			//rest 대신 count++;
			rest++;
		
		}	
		System.out.println();
		
	}
	
	public void print(int year) {
		for(int i=1; i<=12;i++) {
			print(year,i); //월달력 for문 돌려서 구한것
		}
		
	}

}
