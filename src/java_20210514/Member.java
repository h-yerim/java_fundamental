package java_20210514;

public class Member {
	private String id;
	private String name;
	private int age;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	Member(String id, String name, int age){
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId(){
		return id;
	}
	
	public void SetId(String id) {
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	
	
	
}
