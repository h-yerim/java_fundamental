package java_20210430;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;

		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;

		// 1. 각자리수를 2부터 9까지 곱하고 다시 2부터 5까지 곱해서 합을 구한다.
		int sum = 2 * a1 + 3 * a2 + 4 * a3 + 5 * a4 + 6 * a5 + 7 * a6 + 8 * b1 + 9 * b2 + 2 * b3 + 3 * b4 + 4 * b5
				+ 5 * b6;

		// 2. 총합(sum)을 11로 나눈 나머지를 구한다.
		int rest = sum % 11;

		// 3. 11에서 나머지를 뺀다.
		int num = 11 - rest; //rest = 11 - rest로 써도 무방
		
		// 4. 3의 결과를 10으로 나눈 나머지를 구한다.
		int num2 = num % 10; //rest %=10 으로 써도 무방
		
		// 5. 4의 결과와 마지막 숫자(b7)이 같으면 정상적인 주민 번호, 그렇지 않으면 비정상적인 주민 번호 메세지를 출력한다.
		if (num2 == b7) {
			System.out.println("정상적인 주민번호");
		} else {
			System.out.println("비정상적인 주민번호");
		}
	}

}