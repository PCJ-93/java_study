package db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO { // DAO : Data Access Object

	Connection conn = null;
	PreparedStatement psmt;
	ResultSet rs;

	// insert update delete => 실행 후 적용된 행의 갯수를 리턴
	// public int saveDept(int deptno, String dname, String loc) {
	// //saveDept(50,"개발팀","서울")
	public int saveDept(Dept dept) {

		conn = DBConnectionManager.connectDB();
		int result = 0;
		// 쿼리 준비
		String sqlQuery = "insert into dept values (?,?,?)";
		try {
			// 쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());

			// select = executeQuery
			// insert, update, delete = executeUpdate
			result = psmt.executeUpdate();

			while (rs.next()) { // rs.next() : 다음 읽어올 데이터가 있는가? true 데이터가 있다
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

	public List<Dept> findDeptList() { // 여러개 데이터행를 담을때 리스트형태로 리턴

		conn = DBConnectionManager.connectDB();

		// List<Dept> deptList = new ArrayList<Dept>(); // 어레이리스트는 size()로
		// 데이터가있는지없는지확인가능해서 미리 선언해도 상관없다.
		List<Dept> deptList = new ArrayList<Dept>();

//쿼리 준비
		String sqlQuery = "select * from dept";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다

				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료(역순)
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return deptList;
	}

	public int removeDeptByDeptno(int deptno) {
		// DB연결
		conn = DBConnectionManager.connectDB();
		int result = 0;
		// 쿼리 준비
		String sqlQuery = "delete from dept where deptno = ?";
		try {
			// 쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, deptno);

			// select = executeQuery
			// insert, update, delete = executeUpdate
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	public int removeDept(Dept dept) {
		int deptno = dept.getDeptno();
		return removeDeptByDeptno(deptno);
	}

	public Dept findDeptByDeptno(int deptno) { // deptno 번호를 매개변수로 받아서 처리 //Dept객체타입으로 리턴

		conn = DBConnectionManager.connectDB();

//쿼리 준비
		String sqlQuery = "select * from dept where deptno = ?";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setInt(1, deptno); // 1번째 물음표에 매개변수로받은 deptno를 집어 넣는다~

			rs = psmt.executeQuery();

			Dept dept = null;

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getString("loc"));
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				return dept; // 여기다가 그냥 리턴넣으면 아래쪽코드(~~.close();)실행안되서 종료가안된다. 위험하다. 281줄로..
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // finally 안에 종료문 써줘서 위에서 리턴돼도 실행되게 해준다. 301줄로..
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return null; // 여기다가 return dept; 쓰려면 위에 new Dept 선언을 더위쪽에 선언해줘야한다.(지역변수)
	}

}
