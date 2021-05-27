package java_20210527;

public class MemberDtoDemo {
	public static void main(String[] args) {
		//MemberDto 인스턴스를 생성할 때 디폴트 생성자를 호출
		//인스턴스 변수를 초기화 하지않았기 때문에 기본값이 출력됨
		MemberDto dto1 = new MemberDto(); //new -> 메모리에 올리는것. + 매개변수가없는 생성자호출
		System.out.println(dto1.getNum());
		System.out.println(dto1.getName());
		System.out.println(dto1.getAddr());
		
		//디폴트 생성자로 MemberDto 인스턴스를 생성하면 인스턴스 변수를 초기화할수 없기 때문에 안래와 같이 set 메서드를 일일이 호출해야함.
		MemberDto dto2 = new MemberDto();
		dto2.setNum(10);
		dto2.setName("정혜림");
		dto2.setAddr("부산");
		System.out.println(dto2.getNum());
		System.out.println(dto2.getName());
		System.out.println(dto2.getAddr());
		
		//MemberDto 인스턴스를 생성할 때 매개변수 3개짜리 생성자를 호출함. 이렇게 하면 MemberDto 인스턴스가 생성될 때 인스턴스 변수를 초기화할 수 있음
		MemberDto dto3 = new MemberDto(10,"정혜림","부산");
		System.out.println(dto3.getNum());
		System.out.println(dto3.getName());
		System.out.println(dto3.getAddr());
		
		
	}
}
