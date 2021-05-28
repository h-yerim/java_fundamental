package java_20210528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean success = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kpc","kpc12","kpc1212");
			//트랜잭션 시작
			con.setAutoCommit(false);
			StringBuilder sql = new StringBuilder();
			sql.append("insert into member values(202,'kim1','kim2')");
		
			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();
			
			sql.setLength(0);
			sql.append("insert into member values(203,'kim3','kim4"); //오류발생하여 rollback이 일어남
			
			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();
			
			success = true;
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				//트랜잭션 끝 (finally는 수행이 되든 안되든 무조건 실행되기때문)
				if(success) { //성공해서 true라면 commit
					con.commit();
				} else { //에러가나서 false라면 rollback
					con.rollback();
				}
				//Connection pool 사용할 때는 반드시 해주어야함
				con.setAutoCommit(true);
				if(con!=null) con.close();
				if(pstmt1!=null) pstmt1.close();
				if(pstmt2!=null) pstmt2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
