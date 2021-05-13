package java_20210513;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		//int hour = cal.get(Calendar.HOUR); 0~12시
		int hour = cal.get(Calendar.HOUR_OF_DAY); //0~23시
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %n",year,month+1,day);
		System.out.printf("%d:%d:%d%n",hour,minute,second);
		
		//한 주의 몇번째 일이냐. (ex. 1:일 2:월 ...)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		StringBuffer message = new StringBuffer();
		if(dayOfWeek == Calendar.SUNDAY) {
			message.append("일요일");
		}else if(dayOfWeek == Calendar.MONDAY) {
			message.append("월요일");
		}else if(dayOfWeek == Calendar.TUESDAY) {
			message.append("화요일");
		}else if(dayOfWeek == Calendar.WEDNESDAY) {
			message.append("수요일");
		}else if(dayOfWeek == Calendar.THURSDAY) {
			message.append("목요일");
		}else if(dayOfWeek == Calendar.FRIDAY) {
			message.append("금요일");
		}else if(dayOfWeek == Calendar.SATURDAY) {
			message.append("토요일");
		}
	
		System.out.printf("%d년 %d월 %d일은 %s 입니다.%n",year,month+1,day,message);
	
		//ctl +shift + o => 자동 import
		cal.set(2020,1,13); // 날짜를 변경할대 사용하는 메서드, 2020년 5월13일을 구한다. 0부터 시작하니까 4=>5월임
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E요일");
		Date d = cal.getTime();
		String display = sdf.format(d);
		System.out.println(display);
		
		//해당월에 마지막 날짜를 반환(여기서는 위의 cal.set의 월)
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDay);
	}
}
