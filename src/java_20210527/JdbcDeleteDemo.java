package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1. 드라이버를 로드한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//2. 데이터베이스와 연동할수 있는 connection 객체를 만든다.
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212"); //db default port 번호인 3306쓰기 때문에 생략해도 자동설정된다.
			//3.sql을 전송할 수 있는 PreparedStatement 객체를 만든다.
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString()); //()안의 매개변수는 문자열이 들어와야하기때문에 toString 함수
			//4.바인드 변수를 설정
			int index = 1;
			//pstmt.setString(index,String.valueOf(11)); //11을 문자열로 바꾸기위해 valueof쓴다. 이렇게도 돌아가지만 원래 num은 int형이기때문에 setstring 쓰지말자.
			pstmt.setInt(index, 11);
			
			//5. sql문을 전송한다.
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수: "+resultCount);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//6. 모든 자원을 반납한다.
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
