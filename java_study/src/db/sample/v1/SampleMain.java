package db.sample.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {

//		selectDept();
//		System.out.println();
//		System.out.println();
//		findProduct();
//		System.out.println();
//		System.out.println();
//		selectDept2();
//		System.out.println();
//		System.out.println();
//		findDeptByDeptno(40);
//		System.out.println();
//		findDeptByDname("RESEARCH");
//		System.out.println();
//		findDeptByDname("OPERATIONS");

//		Dept d1 = findDeptByDeptno(20);
//		if (d1 != null) {
//			System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
//		}

		List<Dept> dList = findDeptList();
		if (dList != null && dList.size() > 0) { // dList가 널이아니거나 사이즈가0보다크면 (데이터가있다)
			for(Dept d : dList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}
		}

	}

	public static void findProduct() {
//드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

//쿼리 준비
		String sqlQuery = "select * from product";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다 // 데이터가 더이상 없으면 false
// System.out.println(rs.getInt(1));
// System.out.println(rs.getString(2));
// System.out.println(rs.getString(3));

				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

//DB 연결 종료(역순)
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

// readDept findDept findDeptlist
	public static void selectDept() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

//쿼리 준비
		String sqlQuery = "select * from dept";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
// System.out.println(rs.getInt(1));
// System.out.println(rs.getString(2));
// System.out.println(rs.getString(3));

				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

//DB 연결 종료
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

	public static void selectDept2() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

//쿼리 준비
		String sqlQuery = "select * from dept where deptno = 30";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
// System.out.println(rs.getInt(1));
// System.out.println(rs.getString(2));
// System.out.println(rs.getString(3));

				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

//DB 연결 종료
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

	public static Dept findDeptByDeptno(int deptno) { // deptno 번호를 매개변수로 받아서 처리 //Dept객체타입으로 리턴

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

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

		return null; // 여기다가 return dept; 쓰려면 위에 new Dept 선언을 더위쪽에 선언해줘야한다.(지역변수)
	}

	public static void findDeptByDname(String dname) { // dname 이름을 매개변수로 받아서 처리

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

//쿼리 준비
		String sqlQuery = "select * from dept where dname = ?";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setString(1, dname); // 1번째 물음표에 매개변수로받은 dname를 집어 넣는다~

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
// System.out.println(rs.getInt(1));
// System.out.println(rs.getString(2));
// System.out.println(rs.getString(3));

				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

//DB 연결 종료
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

	public static List<Dept> findDeptList() { // 여러개 데이터행를 담을때 리스트형태로 리턴

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db연결
//Statement stmt = null; //연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 결과 저장하는 객체

//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// List<Dept> deptList = new ArrayList<Dept>(); // 어레이리스트는 size()로
		// 데이터가있는지없는지확인가능해서 미리 선언해도 상관없다.
		List<Dept> deptList = null;

//쿼리 준비
		String sqlQuery = "select * from dept";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다
//				System.out.println(rs.getInt("deptno"));
//				System.out.println(rs.getString("dname"));
//				System.out.println(rs.getString("loc"));

				// if(deptList.size()==0) {
				if (deptList == null) {  // deptList가 반복돌때마다초기화되는것 막기
					deptList = new ArrayList<Dept>();
				}

				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

//DB 연결 종료
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

		return deptList;
	}

}
