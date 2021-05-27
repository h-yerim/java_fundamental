package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance(); //getInstance를 통해 객체를 만들면 1개의 객체만 만들어줌
		//MemberDao dao1 = new MemberDao(); //private이기도 하고 싱글턴으로 만들었기때문에 new 객체 생성불가 
		//MemberDao dao2 = MemberDao.getInstance(); //그래서 얘는 dao와 같은 객체를 만듦
		//System.out.println(dao==dao2); 비교해보면 true라고 나옴
		
		/* insert 코드
		int num = 12;
		String name = "김범수";
		String addr = "한국";
		MemberDto dto = new MemberDto(num,name,addr);
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		*/
		
		/* update 코드
		int num = 12;
		String name = "리범수";
		String addr = "북한";
		MemberDto dto = new MemberDto(num,name,addr);
		//생성자가 없을경우 dto.setNum(12) ~ 이런식으로 쫙넣어줘야 하지만 생성자가 있기에 위와 같이 한줄로 멤버변수 초기화가 가능
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		*/
		
		/* delete 코드
		int num = 12;
		boolean success = dao.delete(num);
		if(success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		//select 코드
		int start = 0;
		int len = 10;
		
		ArrayList<MemberDto> list = dao.select(start, len);
		for(MemberDto dto : list) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d %s %s",num,name,addr);	
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
