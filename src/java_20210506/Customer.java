package java_20210506;

public class Customer {
	String name;
	String email;
	String phone;
	int age;
	double balance;
	boolean released;
	
	//객체들이 모두 공유하는 클래식 변수. 
	static double interestRate;	
	
	//final 변수는 instance, static 둘다로 활용 가능하지만 수정이 불가함. 그래서 대부분 final 변수는 static 변수로 사용.
	//final 변수는 관례상 대문자로 사용한다. (ex. final string BANKNAME)
	static final String BANKNAME="신한은행";

	}

