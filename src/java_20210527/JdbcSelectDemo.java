package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			//1. 드라이버를 로드한다.
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//2. 데이터베이스와 연결할 수 있는 Connection 객체 생성
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			//3. sql문을 전솔할 수 있는 PreparedStatemnt 객체 생성
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num desc ");
			sql.append("LIMIT ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인드 변수 설정
			int index = 1;
			pstmt.setInt(index++,0); //1번째 자리에 0 들어가
			pstmt.setInt(index,2);
			
			//5. sql문을 전송(executeQuery())하여 ResultSet(결과)객체를 생성
			rs = pstmt.executeQuery();
			
			//6. ResultSet에서 데이터를 추출 -> getXXX(index) 이용
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++); // or rs.getInt("num");도 가능하나 컬럼명은 변경될 수도 있고 등등 권장하지않음.
				String name = rs.getString(index++); // = rs.getString("name");
				String addr = rs.getString(index); // = rs.getString("addr");
				System.out.printf("%d %s %s %n",num,name,addr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//7. 모든 자원을 반납한다.
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
