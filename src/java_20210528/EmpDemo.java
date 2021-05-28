package java_20210528;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		
		/*insert 구문
		EmpDto dto = new EmpDto(9003,"KIM","MANAGER",7839,null,50000,40000,30);
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		*/
		
		/*update 구문
		EmpDto dto = new EmpDto(9003,"KIM1","MANAGER1",1212, null, 50001,40001,40);
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		*/
		
		/*delete구문
		EmpDao dao = EmpDao.getInstance();
		boolean success = dao.delete(9003);
		if(success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		//select 구문
		ArrayList<EmpDto> list = dao.select(0,5);
		for(EmpDto dto: list) {
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptno = dto.getDeptNo();
			System.out.printf("%d %s %s %d %s %.1f %.1f %d",no,name,job,mgr,hiredate,sal,comm,deptno);
			System.out.println();
		
			//for 문안의 코드 밑의 한줄로도 가능
			//= System.out.printf("%d %s %s %d %s %f %f %d",dto.getNo(),dto.getName(),dto.getJob(),dto.getMgr(),dto.getHiredate(),dto.getSql(),dto.getComm(),dto.getDeptNo());
		
		}
		
		
		
	}
}
