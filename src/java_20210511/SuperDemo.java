package java_20210511;

// public class 는 한 파일안에 반드시 하나에만 있어야 한다.
class A{
	int a;
	A(int a){
		this.a = a;
	}
	
}

class B extends A{
	B(){
		super(10); // ()에 매개변수를 줘버리면 A(int a)가 있어도 에러가 나지 않는다.
	}
}



public class SuperDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	}
}
