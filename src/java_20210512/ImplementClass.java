package java_20210512;
//클래스에서 인터페이스를 상속받을 때는 implements 키워드를 사용한다.
public class ImplementClass implements InterA{
	public void mA() {
		System.out.println("mA 메서드");           //오버라이딩 해야 에러가 나지 않는다.	
	}
	public void mB() {
		System.out.println("mB 메서드");
	}
	public void mC() {
		System.out.println("mC 메서드");	
	}
}
