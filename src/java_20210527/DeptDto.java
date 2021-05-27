package java_20210527;
// dto => 1. 테이블의 변수들 선언 2. 디폴트, 매개변수있는 생성자 생성 3. setter와 getter 생성
public class DeptDto {
	private int no; //db는 db안의 column들끼리 중복허용안해서 dept를 no 앞에 넣음 but java에서는 멤버변수 중복 허용하니까 이를 변경해서 변수선언
	private String name;
	private String loc;
	
	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
