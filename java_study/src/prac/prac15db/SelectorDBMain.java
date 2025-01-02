package prac.prac15db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectorDBMain {

	public static void main(String[] args) {

		Product pd = findProductByPCode(104);
		if (pd != null) {
			System.out.printf("%d %s %d\n", pd.getP_code(), pd.getP_name(), pd.getP_price());
		}
		
		System.out.println();
		
		List<Product> pdList = findProductList();
		if( pdList.size() > 0) {
			for(Product product : pdList) {
				System.out.printf("%d %s %d\n", product.getP_code(), product.getP_name(), product.getP_price());
			}
		}

	}

	public static Product findProductByPCode(int p_code) { // 단일조회

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

		Product pd = null;
//쿼리 준비
		String sqlQuery = "select * from product where p_code = ?";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, p_code);
			rs = psmt.executeQuery();

			while (rs.next()) {

				pd = new Product();

				pd.setP_code(rs.getInt("p_code"));
				pd.setP_name(rs.getString("p_name"));
				pd.setP_price(rs.getInt("p_price"));

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
		return pd;
	}

	public static List<Product> findProductList() { // 리스트조회

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
		List<Product> productList = new ArrayList<Product>();

//쿼리 준비
		String sqlQuery = "select * from product";
		try {
//쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) {

				if (productList.size() == 0) { // deptList가 반복돌때마다초기화되는것 막기
					productList = new ArrayList<Product>();
				}

				Product pd = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(pd);

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

		return productList;
	}

}
