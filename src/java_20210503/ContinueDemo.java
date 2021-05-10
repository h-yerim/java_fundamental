package java_20210503;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==6)continue; // = if(i!=6) 과 같은 의미
			sum+=i;
		}
		System.out.println("합은: "+sum);

		
	//별 출력
		for(int i=0;i<5;i++) {
			for(int j=0; j<=i;j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
	//별 거꾸로 출력	
		for(int i=4;i>=0;i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	//소수구하기 연습...
		int total=0;
		for(int i=2; i<=100; i++) {
			int count = 0;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}	
			}
			if(count ==0) {
				total++;
				System.out.print(i+"\t");
			}
		}
			System.out.println();
		
		
	}

}









/*
 * int a=new int[4];
 * a[0]=1;
 * 
 */












