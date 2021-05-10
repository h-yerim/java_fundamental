package java_20210510;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate;
	private String edate;
	private String regdate;
	
	//seq의 setter => seq를 수정할 때 사용
	public void setSeq(int seq) { //seq의 자료형이 int이기 떄문에 매개변수도 int
		//this를 사용한 이유는 로컬 변수와 멤버변수를 구분하기 위해서
		this.seq=seq; // 왼쪽은 멤버변수고 오른쪽은 로컬변수
	}
	
	//seq의 getter => seq의 정보를 가져올 때 사용
	public int getSeq() { //반환값인 seq가 int 이기 때문에 int 선언
		return seq; //원래는 this.seq 이지만 생략하는 것은 로컬변수가 없기때문
	}
	
	
	//group의 setter
	public void setGroup(int group) {
		this.group = group;
	}
	
	//group 의 getter
	public int getGroup() {
		return group;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	//자료형이 boolean일 경우 get이 아니라 is로 생성한다. (setter는 노상관)
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	public String getSdate() {
		return sdate;
	}
	
	
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	public String getEdate() {
		return edate;
	}
	
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String getRegdate() {
		return regdate;
	}
	
	
	
	
}
