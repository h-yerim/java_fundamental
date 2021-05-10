package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		
		//String name = m.getName();
		//System.out.println(name); 요렇게 두줄로도 쓸수 있지만 간결하게는 밑에처럼 한문장으로 가능	
		// = system.out.println(m.getName());
				
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
		
	}
	
	
	public static void main(String[] args) {
		Member m = new Member();
		//m.name = ""; <-안된다는 것~!
		m.setName("정혜림");
		m.setEmail("hyerim@aaa.com");
		m.setZipcode("09876");
		m.setAddr1("서울 종로구 다동");
		m.setAddr2("동아빌딩");
		m.setAge(20);
	
		print(m);		
	}
}
