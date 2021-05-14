package java_20210504;

public class LotteryDemo {

	public static void main(String[] args) {
		// math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 값 반환

		int[] lotto = new int[6]; // 값이 뭔지 모르니 이렇게 선언. 안다면 {}로 값도 선언.
		for (int i = 0; i < lotto.length; i++) {
			// 1보다 크거나 같고 45보다 작은 임의의 int 값 반환. for loop 돌때마다 새로 선언해야하니 항상 for문 안에 선언
			int random = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;
			for (int j = 0; j < i; j++) { // 0일때는 수행 X (맨 첫번째는 비교할 필요가 없으니까)
				if (random == lotto[j]) {
					isExisted = true;
					break;
				}
			}

			if (isExisted) {    //isExisted는 기본이 false이기때문에 true로 바뀌지 않으면 if문은 수행되지 않음.
				i--;
			} else {
				lotto[i] = random;
			}
		}
		
		//오름차순 정렬
		for(int i =0; i<lotto.length;i++) {
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i]<lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		/*
		 * 강사님 오름차순 정렬 코드
		 * for(int i=0; i<lotto.length; i++){
		 * for(int j=0; j<lotto.length-(i+1);j++){    //이 코드는 첫번째 요소는 비교안하는..코드
		 * if(lotto[j]>lotto[j+1]){
		 * int temp = lotto[j];
		 * lotto[j] = lotto[j+1];
		 * lotto[j+1] = temp;
		 * }
		 * }
		 * }
		 */
		

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}

	}

}
