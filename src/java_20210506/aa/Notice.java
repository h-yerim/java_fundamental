package java_20210506.aa;

public class Notice {
	//접근한정자제외하면 다 instance 변수
	public int number;
	protected String title;
	int hit; //default (아무것도 안적혀있기때문)
	private String regdate;
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 1; //public은 서로 다른패키지에서 접근가능
		n.title = "공지사항 입니다."; //protected 서로 다른 패키지이면서 상속받은 경우만 접근가능
		n.hit = 0; //default 같은 패키지 내에서 접근가능
		n.regdate = "2021-05-06"; //private 클래스 내에서 접근 가능
		
	
	}

}
