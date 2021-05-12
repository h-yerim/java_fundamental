package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		//올림
		double d = Math.ceil(4.3);
		System.out.println(d);
		//내림
		d = Math.floor(4.9);
		System.out.println(d);
		//반올림
		int i = Math.round(5.6f);
		System.out.println(i);
		//반올림
		long l = Math.round(4.9);
		System.out.println(l);
		//절대값
		i = Math.abs(-4);
		System.out.println(i);
		//비교후 최소값
		d = Math.min(4.2, 4.4);
		System.out.println(d);
		//비교후 최댓값
		d = Math.max(4.2, 4.4);
		System.out.println(d);
		//제곱근
		d = Math.sqrt(4);
		System.out.println(d);
		//지수승(2의 4승)
		d = Math.pow(2, 4);
		System.out.println(d);
		//랜덤한 숫자 
		d = Math.random();
		System.out.printf("%.0f",10 * d);
		
		
	}
}
