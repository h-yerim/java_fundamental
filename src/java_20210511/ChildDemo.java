package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		
		//자식것만 이용해서 객체생성
		Child child =  new Child("010-1234-5678",50.3,161);
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
			
		
		//부모의 것도 이용해서 객체 생성
		Child child2 = new Child("정혜림","서울",20,"010-1234-5678",50.3,161);
		System.out.println(child2.name);
		System.out.println(child2.address);
		System.out.println(child2.age);
		System.out.println(child2.phone);
		System.out.println(child2.weight);
		System.out.println(child2.height);
		

	}
	
	
	
}
