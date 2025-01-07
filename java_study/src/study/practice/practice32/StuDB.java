package study.practice.practice32;

import java.util.List;

public class StuDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuConnector sc1 = new StuConnector();
		sc1.dbConn();
		StuDAO sd1 = new StuDAO();
		List<StuDTO> list1 = sd1.getStudentInfo();
		for(StuDTO s : list1) {
			System.out.println(s);
		}
		sc1.dbDisConn();

		System.out.println("********3학년리스트********");
		
		sc1.dbConn();
		list1 = sd1.getStudentInfo(3);
		for(StuDTO s : list1) {
			System.out.println(s);
		}
		sc1.dbDisConn();
		
        
	}
	

}
