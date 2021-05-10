package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;

	// 디폴트 생성자 (매개변수가 없는 생성자)
	// 생성자 => [접근한정자][클래스이름](){} <=접근한정자 4가지 다 올 수있다.
	// 생성자는 클래스이름과 동일해야하며 반환값이 없다.
	// 생성자의 역할은 인스턴스 변수 초기화.
	// 생성자는 오버로딩이 가능하다.
	// 생성자의 접근 한정자는 인스턴스(new) 유무를 결정한다.
	public Admin() {
		// super(); <- 모든 생성자에는 super가 숨어있다
	}
	
	//this 의 용법 2가지
	//1.자기자신 객체 => this or this. => 위치는 메서드, 생성자 모두 사용
	//2.다른 생성자를 호출 =>this(매개변수) => 위치는 생성자에서만 사용가능
	
	public Admin(String id, String pwd, String email) {
		this(id,pwd,email,0); //다른 생성자 호출(string, string, string, int 매개변수를 가진) -> 다 초기화하고 int는 0으로 초기화
		//몇개만 초기화 할거면 this.id = id; 쓰자
	}

	public Admin(String id, String pwd, String email, int level) {
		
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void SetLevel(int level) {
		this.level = level;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}

}
