package java_20210506;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "정혜림";
		c1.age = 20;
		c1.email = "test@test.com";
		c1.phone = "010-0000-0000";
		c1.balance = 1_000_000;
		c1.released = false;
		//class 변수이기때문에 instance 노필요. 변수로도 접근가능하나 권장하지 않고(ex.c1.inter~), 클래스이름으로 접근하는 것이 관례
		Customer.interestRate = 6.2;
		// Customer.BANKNAME = "국민은행"; <- final 변수이기때문에 값 수정(재할당)불가.
		
		System.out.printf("%s, %d, %s, %s, %f, %s %n"
				,c1.name, c1.age, c1.email,c1.phone,c1.balance,c1.released);
		
		Customer c2 = new Customer();
		c2.name = "김민수";
		c2.age = 30;
		c2.email = "gang@cheol.com";
		c2.phone = "010-1112-2223";
		c2.balance = 50_000_000_000_000l; //long 표시해야 값 표현 가능 double이라 long 포함가능
		c2.released = false;
		Customer.interestRate = 8.2;
		
		System.out.printf("%s, %d, %s, %s, %f, %s %n"
				,c2.name, c2.age, c2.email,c2.phone,c2.balance,c2.released);
		
		//reference(class) 는 같은 인스턴스를 참조
		Customer c3 = c2;
		c3.name = "김민수1";
		
		System.out.printf("%s, %s %n", c2.name, c3.name);
		// System.out.printf("%f", c1.interestRate);  8.2 로 나온다. 공용 변수이기때문에 값 바뀌면 함께 바뀜.
		System.out.printf("%f", Customer.interestRate); //print 할때도 Customer. 으로 접근해서 출력
		
	
	}

}

