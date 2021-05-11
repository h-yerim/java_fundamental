package java_20210511;

public class SubDemo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.money); //부모의 instance 변수 sub통해 접근가능
		sub.makeMoney(); //부모의 함수도 접근가능
		System.out.println(sub.chicken); //자식의 instance 변수 sub통해 접근
		sub.gotoSchool();
		
		sub.play("~~"); //sub(자식)의 play가 호출됨.
		
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~"); //super의 메서드 호출
		
		
		Super sup1 = new Sub(); //Super에 있는것만 접근가능, 다만 Sub의 overriding 된 메서드는 접근가능
		System.out.println(sup.money);
		sup.makeMoney();
		sup1.play("~~"); //sub의 메서드 호출(overriding)
		
		
		System.out.println(sub.toString()); //object 메서드인 toString.
		System.out.println(sub); //사실상 .toString()이 생략된 것임.
		
		
		Object obj = new Sub();
		System.out.println(obj.toString()); //자식 어디에선가 overriding 했다면 overriding 한 메서드가 출력됨.
		
		
	}
}
