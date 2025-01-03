package prac.prac16db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDB {

	public static void main(String[] args) {

		List<Professor> pfList = findProfessorListByDeptno(101);
		for(int i = 0; i<pfList.size(); i++) {
			System.out.println(pfList.toString());
		}
		
//		if (pfList.size() > 0) {
//			for (Professor prof : pfList) {
//				System.out.printf("%d %s %s %s %d %d\n", prof.getProfno(), prof.getName(), prof.getId(),
//						prof.getPosition(), prof.getPay(), prof.getDeptno());
//			}
//		}

	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		

		String sqlQuery = "select profno, name, id, position, pay, deptno from professor where deptno = ?";
		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			while (rs.next()) {
				List<Professor> profList = new ArrayList<Professor>();

				Professor pf = new Professor(rs.getInt("profno"), rs.getString("name"), rs.getString("id"),
						rs.getString("position"), rs.getInt("pay"), rs.getInt("deptno"));
				profList.add(pf);
				
				return profList;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (psmt != null) {
					psmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
