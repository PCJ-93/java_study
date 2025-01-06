package study.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArplDAO {
	
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs;
	
	public int saveArplInfo(ArplInfo arplInfo) {

		conn = DBConnectionManager.connectDB();

		int result = 0;

		String sqlQuery = " insert into ARPLINFO values ( arplinfo_pk_seq.nextval , ?, ?, ?) ";
		
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);

			//파라미터 셋팅
			psmt.setInt(1, arplInfo.getBaseDate());
			psmt.setInt(2, arplInfo.getBaseTime());
			psmt.setInt(3, arplInfo.getFcstTime());
			
			//select -> executeQuery
			//insert, update, delete -> executeUpdate

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);	
		}

		return result;
	}
	
}
