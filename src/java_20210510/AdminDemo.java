package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		//new 뒤의 admin은 매개변수 없는 생성자를 호출
		//같은 클래스 내 객체 생성 (생성자의 접근한정자가 public일 경우)
		//생성자는 보통 private or public 이다.
		
		//Admin a <-역시 클래스의 접근한정자에 의해 선언이 가능함. 띠라서 class가 public이 아닐경우 다른패키지일때 에러가 날 수 있다.
		Admin a = new Admin("hhh","123","aa@aa",20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		
		
		
		/*
		 * 생성자가 아니라면 밑에처럼 코딩해야한다. 따라서 생성자가 있으면 훨씬 간결해진다.
		 * setter 는 결국 하나만 수정할때 쓰이곤 한다.
		 * Admin a1 = new Admin();
		 * a1.setId("");
		 * a1.setPwd("");
		 * a1.setEmail("");
		 * a1.setLevel(20);
		 */
	}
}
