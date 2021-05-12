package java_20210512;
//인터페이스간의 상속은 extends 키워드를 사용하고, 다중상속이 가능하다.
public interface InterA extends InterB, InterC {
	//인턴페이스의 변수는 public static final 이 생략되어 있다. (final 이기때문에 대문자 => 수정불가)
	double PI = 3.14;
	//인터페이스의 접근 한정자를 붙이지 않으면 public이 생략되어 있다.
	//abstract 역시 생략 가능 ( = public abstract void mA())
	void mA();
	
}
