package java_20210526;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {
	public static void main(String[] args) {
		//1. 드라이브 로드한다.
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 데이터베이스와 연결할 수 있는 connection 객체를 만든다.
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			
			//3. sql문을 전송 할 수 있는 preparedstatement 객체를 만든다.
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME =?, addr =? ");
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩 변수를 설정한다.
			int index = 1;
			pstmt.setString(index++, "두테르테2");
			pstmt.setString(index++, "필리핀2");
			pstmt.setInt(index, 11);
			
			//5. sql문을 전송한다.
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수: "+resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//6. 모든자원을 반납한다.
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}
}
