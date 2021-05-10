package java_20210503;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) { //i++ 는 i+=1 과 같은 의미.
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.\n", sum);
		
	    sum = 0;
	    //또다른 코드는 for(int i=2; i<=10; i+=2) 로 구함
		for (int i = 1; i <= 10; i++) {
			if(i % 2==0) {
			sum = sum + i;
			}
		}
		System.out.printf("1부터 10까지 짝수 합은 %d 입니다.%n", sum);
		
		//구구단
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n",first);
			for (int second = 1; second <=9 ; second++) {
				System.out.printf("%d * %d = %d %n",first,second,first*second);
			}
		}
		
		
	    //소수 구하기
		int totalCountOfPrimeNumber=0;
		int totalIndex=0;
		for(int i=2;i<=100;i++) {
			int count = 0;
			//1과 자기자신은 빼고 비교, 포함하려면 for(int j=1;j<=1;j++)로 돌려야하고 밑의 if문의 count==2로 변경.
				for(int j=2; j<i; j++) { //j<=i/2 로 바꾸면 더 줄어들음. 약수가 자기보다 많은 수는 없기때문
				if(i%j==0) {
					count ++;
					//break; <- 1과 자기자신을 빼고 나눠지는게 1개라도 있다면 뒤에것들은 비교할필요가 없기때문에 여기서 끝내는 break문을 쓰면 totalIndex 줄어듦. break 감싸는 for문 전체 탈출.
				}
				totalIndex++;
			}
			if(count==0) {
				totalCountOfPrimeNumber++;
				System.out.print(i+"\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		
		
		
		
	}
		

}

