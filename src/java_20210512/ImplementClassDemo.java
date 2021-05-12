package java_20210512;

public class ImplementClassDemo {
	public static void main(String[] args) {
		InterA i = new ImplementClass(); //인터페이스는 객체 생성을 할 수 없다. 따라서 하위 객체를 통해 접근
		i.mA();
		i.mB();
		i.mC();
		System.out.println(InterA.PI);
	}
}
