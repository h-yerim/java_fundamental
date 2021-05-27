package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	// 1. MemberDao 변수인 single을 static 변수로 설정한다. -> static 메서드 안에서는 static 변수(그래서
	// single)만 가능
	private static MemberDao single;

	// 2. 생성자의 접근한정자를 private으로 설정한다. => 외부에서 객체 생성 불가(하나의 객체만 사용하려고 하는것)
	private MemberDao() {
		try {                                           //드라이버 로드는 한번만 하면됨. 따라서 생성자에 둔다(객체가 생성될때 단 한번만 호출됨)
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// MemberDao의 객체는 getInstance() 메서드로만 생성
	// getInstance() 메서드의 구현은 MemberDao 객체를 한개만 생성할 수 있도록 만들어야 한다.
	// static 메서드로 구현한 이유는 MemberDao 객체를 외부에서 생성할 수 없기 때문이다. => 그러면 클래스이름으로
	// getinstance 바로 호출가능)
	public static MemberDao getInstance() {
		if (single == null) {
			single = new MemberDao(); //매개변수 없음. 왜냐하면 instance변수가 하나도 없기때문
		}
		return single;
	}

	public boolean insert(MemberDto dto) { //call by reference : dao의 dto와 main의 dto가 같은 객체(main의 객체)를 가리킴.
		boolean success = false;
	
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/kpc", 
					"kpc12", 
					"kpc1212"); 

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO member(num,NAME,addr)"); 
			sql.append("VALUES(?,?,?)"); 

			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setInt(index++, dto.getNum()); 
			pstmt.setString(index++, dto.getName()); 
			pstmt.setString(index, dto.getAddr());

			pstmt.executeUpdate(); //이문장까지 수행했다는 얘기는 성공했단 얘기니까
			success = true; //success를 true로

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return success;
	}

	public boolean update(MemberDto dto) {
		boolean success = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE member ");
			sql.append("SET NAME =?, addr =? ");
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, dto.getName());
			pstmt.setString(index++, dto.getAddr());
			pstmt.setInt(index, dto.getNum());
		
			pstmt.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public boolean delete(int num) { //객체를 굳이 넘길이유가 없음. 지울 값은 num 하나만 필요하기 때문
		boolean success =false;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212"); 
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());

			int index = 1;
			pstmt.setInt(index, num);
			
			pstmt.executeUpdate();
			success = true;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public ArrayList<MemberDto> select(int start, int len) { //call by value -> main과 아무상관없는 값
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc","kpc12","kpc1212");
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member ");
			sql.append("ORDER BY num desc ");
			sql.append("LIMIT ?,?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setInt(index++,start); 
			pstmt.setInt(index,len);

			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				index = 1;
				int num = rs.getInt(index++); 
				String name = rs.getString(index++); 
				String addr = rs.getString(index);
				list.add(new MemberDto(num,name,addr)); //객체(db의 한행)를 하나로 담기위해서
				// = MemberDto dto = new MemberDto(num,name,addr);
				// = list.add(dto); 이 두줄을 한줄로 줄인게 위의 코드
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
