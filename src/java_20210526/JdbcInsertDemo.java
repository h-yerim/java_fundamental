package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		
		//1. 드라이버 로드한다.
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패: "+e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터베이스와 연결할 수있는 connection 객체를 만든다.
			con = DriverManager.getConnection( //connection 객체 만드는방법.(안에 인자는 3개가 들어간다)
					"jdbc:mysql://localhost:3306/kpc", //url (자바가 정해준 형식(jdbc~sql):ip:port/db)
					"kpc12", //user
					"kpc1212"); //password
			System.out.println("데이터베이스 연결 성공");
			
			//3. sql문을 전송할 수 있는 PreparedStatement 객체를 생성한다.
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num,NAME,addr)"); //sql문 넣기전에 먼저 sql문 돌려보고 넣을것
			sql.append("VALUES(?,?,?)"); // ? => 변수처리

			pstmt = con.prepareStatement(sql.toString()); //stringbuilder를 tostring을 통해 string class로 만들어준것
			//4. 바인딩 변수 설정ㄹ하기
			pstmt.setInt(1, 11); //1번째 자리에 11을 집어넣겠다.
			pstmt.setString(2, "두테르테"); //2번째 자리에 두테르테를 집어넣겠다.
			pstmt.setString(3, "필리핀");
			
			//5. sql문을 전송한다.
			
			int resultCount = pstmt.executeUpdate(); //1개를 갱신했으면 반환값은 1
			System.out.println("갱신된 행의 수 : "+resultCount); 
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
			
		
	}
}
