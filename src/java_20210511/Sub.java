package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	
	//overriding : 부모의 메서드를 재정의
	//작성규칙
	//1. 반환형, 메서드이름, 매개변수 일치
	//2. 접근한정자는 부모보다 자식이 상위이거나 같으면 된다.
	//부모의 기능 + 자식의 기능을 하거나 부모의 기능 상관없이 새 기능을 정의할때 overriding을 한다.
	public void play(String starcraft) {
		//super.play("badook"); //부모의 기능
		System.out.println("Sub play(~) 호출"); // + 자식의 기능
	}
	
	public String toString() { // Object 클래스의 method toString 재정의 (overriding)
		return "서브클래스입니다.";
	}
}