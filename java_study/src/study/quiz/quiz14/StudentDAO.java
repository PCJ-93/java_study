package study.quiz.quiz14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import study.db.sample.v2.DBConnectionManager;

public class StudentDAO {

	public List<StudentDTO> findStudent() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		List<StudentDTO> studentInfo = new ArrayList<>();

		String sqlQuery = "select * from student";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) {
				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString("birthday"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentInfo.add(student);
				
			}
			
			return studentInfo;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return studentInfo;
	}
	
	
	public List<StudentDTO> findStudent(int grade) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		List<StudentDTO> studentInfo = new ArrayList<>();

		String sqlQuery = "select * from student where grade = ?";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			while (rs.next()) {
				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString("birthday"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentInfo.add(student);
				
			}
			
			return studentInfo;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return studentInfo;
	}
	
	
	public int insertStudentInfo(int studno, String name, String id, int grade, String jumin, String birthday, String tel, int height,
			int weight, int deptno1, int deptno2, int profno) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		List<StudentDTO> studentInfo = new ArrayList<>();
		
		int result = 0;

		String sqlQuery = "insert into student values (?,?,?,?,?,?,?,?,?,?,?,?) ";
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, studno);
			psmt.setString(2, name);
			psmt.setString(3, id);
			psmt.setInt(4, grade);
			psmt.setString(5, jumin);
			psmt.setString(6, birthday);
			psmt.setString(7, tel);
			psmt.setInt(8, height);
			psmt.setInt(9, weight);
			psmt.setInt(10, deptno1);
			psmt.setInt(11, deptno2);
			psmt.setInt(12, profno);
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
	

}
