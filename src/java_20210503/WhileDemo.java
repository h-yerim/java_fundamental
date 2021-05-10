package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // 초기값
		while (i <= 10) { // 조건식
			sum += i;
			i++; // 증감
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.\n", sum);

		// while문 구구단
		int first = 2;
		while (first < 10) {
			System.out.printf("%d단입니다.%n", first);
			int second = 1; // 여기있어야 밑의 while문이 돌 수 있음.
			while (second < 10) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
				second++;
			}
			first++;

		}

	}

}


