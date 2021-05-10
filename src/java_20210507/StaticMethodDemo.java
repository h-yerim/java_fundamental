package java_20210507;

//instance method 에서는 클래스 전역 변수인 instance, static 변수 둘다 사용가능
//static method 에서는 클래스 전역변수인 instance 변수, instance method 사용할 수 없다. (메모리에 올라와있지않기 때문) => static method 내에서 instance 객체 생성(변수)해서 사용은 가능. (java 4.pdf 27,30page)
//static은 객체 생성전에 이미 메모리에 로드됨.
//this 는 heap area에 생성된 클래스 자기자신을 가리킴(?)

public class StaticMethodDemo {
	String name;
	static double interestRate;
	public void m1() {
		System.out.println("instance method m1() 호출");
	}
	public void m2() {
		//instance method에서는 모든 변수를 사용하고 모든 method를 호출 할 수 있음.
		name = "정혜림"; // 원래는 this.name 을 쓰는건데 생략한것. this. <= 자기자신 인스턴스
		interestRate = 3.4; //static 변수이기때문에 클래스 이름이 생략되어 있는것. 원래는 StaticMethodDemo.interestRate 인것
		m1(); //instance method 기 때문에 사실 this.m1() 인데 this 생략된 것
		m3(); // = StaticMethodDemo.m3() 
	}
	
	public static void m3() {
		System.out.println("static method m3()호출");
	}
	public static void m4() {
		//static method 에서는 static 변수와 static method만 사용할 수 있다.
		//name = "홍길동"; <-오류떳다 해서 얘를 static 으로 만들고 그러면 안됑! 차라리 method를 instance로 바꾸던지
		interestRate = 4.3;
		//m1();
		m3();
	}
	
	public static void main(String[] args) {
		//객체를 아직 생성하지 않았기 때문에 static method랑 변수만 사용가능.
		m3();
		m4();
		interestRate = 4.3;
		//객체 생성
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.name = "정혜림";
		smd.m1();
		
	}
}
