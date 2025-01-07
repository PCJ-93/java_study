package study.practice.practice32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.ConvertDateUtil;

public class StuDAO {

    // student 테이블의 모든 정보를 가져오는 메서드
    public List<StuDTO> getStudentInfo() {
    	
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        List<StuDTO> stuInfo = new ArrayList<>(); // 학생 정보를 저장할 리스트
        String sqlQuery = "SELECT * FROM student";

        try {
            // 연결 생성 (예제 코드에서는 conn을 외부에서 주입하거나 초기화하는 방식으로 구현해야 함)
            psmt = conn.prepareStatement(sqlQuery);
            rs = psmt.executeQuery();

            while (rs.next()) {
                // StuDTO 객체 생성 및 데이터 설정
                StuDTO student = new StuDTO();
                student.setStudno(rs.getInt("studno"));
                student.setName(rs.getString("name"));
                student.setId(rs.getString("id"));
                student.setGrade(rs.getInt("grade"));
                student.setJumin(rs.getString("jumin"));
                student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
                student.setTel(rs.getString("tel"));
                student.setHeight(rs.getInt("height"));
                student.setWeight(rs.getInt("weight"));
                student.setDeptno1(rs.getInt("deptno1"));
                student.setDeptno2(rs.getInt("deptno2"));
                student.setProfno(rs.getInt("profno"));
                
                
                stuInfo.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (rs != null) rs.close();
                if (psmt != null) psmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return stuInfo;
    }
    
    
public List<StuDTO> getStudentInfo(int grade) {
    	
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
        List<StuDTO> stuInfo = new ArrayList<>(); // 학생 정보를 저장할 리스트
        String sqlQuery = "SELECT * FROM student where grade = ?";

        try {
            // 연결 생성 (예제 코드에서는 conn을 외부에서 주입하거나 초기화하는 방식으로 구현해야 함)
            psmt = conn.prepareStatement(sqlQuery);
            psmt.setInt(1, grade);
            rs = psmt.executeQuery();

            while (rs.next()) {
                // StuDTO 객체 생성 및 데이터 설정
                StuDTO student = new StuDTO();
                student.setStudno(rs.getInt("studno"));
                student.setName(rs.getString("name"));
                student.setId(rs.getString("id"));
                student.setGrade(rs.getInt("grade"));
                student.setJumin(rs.getString("jumin"));
                student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
                student.setTel(rs.getString("tel"));
                student.setHeight(rs.getInt("height"));
                student.setWeight(rs.getInt("weight"));
                student.setDeptno1(rs.getInt("deptno1"));
                student.setDeptno2(rs.getInt("deptno2"));
                student.setProfno(rs.getInt("profno"));
                
                
                stuInfo.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (rs != null) rs.close();
                if (psmt != null) psmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return stuInfo;
    }
}
