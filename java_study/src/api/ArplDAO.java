package api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.sample.v2.DBConnectionManager;

public class ArplDAO {

	Connection conn = null;
	PreparedStatement psmt;
	ResultSet rs;

	public int saveArplInfo(ArplInfo arplInfo) {

		conn = DBConnectionManager.connectDB();
		int result = 0;
		// 쿼리 준비
		//String sqlQuery = "insert into arplinfo values ((select nvl(max(arplno),0)+1 from arplinfo),?,?,?,?,?,?)";
		String sqlQuery = "insert into arplinfo values (arplinfo_pk_seq.nextval,?,?,?,?,?,?)";
		try {
			// 쿼리 실행 수 데이터 후속처리
			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 셋팅
			psmt.setString(1, arplInfo.getInformCode());
			psmt.setString(2, arplInfo.getActionKnack());
			psmt.setString(3, arplInfo.getInformCause());
			psmt.setString(4, arplInfo.getInformData());
			psmt.setString(5, arplInfo.getInformGrade());
			psmt.setString(6, arplInfo.getImageUrl1());
			

			// select = executeQuery
			// insert, update, delete = executeUpdate
			result = psmt.executeUpdate();

			while (rs.next()) { // rs.next() : 다음 읽어올 데이터가 있는가? true 데이터가 있다
				arplInfo = new ArplInfo();
				arplInfo.setArplNo(rs.getInt("arplno"));
				arplInfo.setInformCode(rs.getString("InformCode"));
				arplInfo.setActionKnack(rs.getString("ActionKnack"));
			}

		} catch (Exception e) {
		} finally {
			// DB 연결 종료
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}
