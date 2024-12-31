package db.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDept();
		
		System.out.println();
		
		findProduct();

	}

	public static void findDept() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, userid, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "select * from dept";

		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				try {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					System.out.println(deptno + " " + dname + " " + loc);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public static void findProduct() {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott";
		String passwd = "tiger";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, userid, passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "select * from product";

		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				try {
					int p_code = rs.getInt("p_code");
					String p_name = rs.getString("p_name");
					int p_price = rs.getInt("p_price");
					System.out.println(p_code + " " + p_name + " " + p_price);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					rs.close();
				if (conn != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
