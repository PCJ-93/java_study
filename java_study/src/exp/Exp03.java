package exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {

		Sample s = new Sample();

		try {
			s.addItem1("하나");
		} catch (Exception e) {
			System.out.println("main에서 하나 예외처리");
		}

		// try {
		s.addItem2("둘");
		// } catch (Exception e) {
		// System.out.println("main에서 둘 예외처리");
		// }

//		s.addItem1("1");
//		s.addItem2("2");
		try {
			s.addItem3("3");
		} catch (Exception e) {
			System.out.println("main에서 additem3 호출 후 예외처리");
		}

		try {
			s.addItem4("4");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외처리");
		}

		try {
			s.addItem3("5");
		} catch (Exception e) {
			// e.printStackTrace();
		}

		s.addItem2("저장");
		System.out.println(s.list.get(4));
		System.out.println(s.list.get(0));

		try {
			s.addItem5("77");
		} catch (Exception e) {
			System.out.println("main 에서 addItem5에 throw e 처리");
		}

		int result = s.addItem6("66");
		if (result == 1) {
			// O
		} else { // if result == -1
			// X Exception
		}

		try {
			s.addItem7("77");
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		} catch (ListFullException e) {
			e.printStackTrace();
		}

	}
}

class Sample {

	List<String> list;

	void addItem1(String s) { // 메인에서 예외처리
		list.add(s);
	}

	void addItem2(String s) { // 자체에서 예외처리
		try {
			list.add(s); // 예외발생
		} catch (Exception e) {
			System.out.println("Sample addItem2 에서 예외처리 함");

			if (list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}

		}
	}

	void addItem3(String s) throws Exception { // 예외날것이다 선언.. 이거 부르는쪽에서 예외처리 꼭 해줘야한다 try catch
		list.add(s);
	}

	void addItem4(String s) throws NullPointerException { // 널포인터예외날것이다 선언.. 이거 부르는쪽에서 예외처리 꼭 해줘야한다 try catch
		list.add(s);
	}

	void addItem5(String s) {
		try {
			// list.add(s); //예외발생
			list.get(10);
		} catch (Exception e) {
			System.out.println("Sample addItem5 에서 예외처리 함");
			throw e; // 이거 없으면 위에 문구뜨고 끝 .. // 붙이면 additem5부른애한테 에러띄움
		}
	}

	int addItem6(String s) {

		try {
			list.add(s);
		} catch (Exception e) {
			// 잘못됐다. -1 반환되면 비정상인것
			return -1;
		}
		return 1; // 1이 반환되면 정상인것
	}

	void addItem7(String s) throws InvalidParameterValueException, ListFullException {
		if (s == null) { // ~||~||~||~ 이상한거 보내면
			throw new InvalidParameterValueException(); // 저장할수없는값이다
		}
		try {
			list.add(s);
		} catch (Exception e) {
			// new list[10] 개짜리에
			// list[10] 저장시도하면
			throw new ListFullException(); // 꽉찼다
		}

	}

}

class ListFullException extends Exception { //커스텀익셉션
}

class InvalidParameterValueException extends Exception {//커스텀익셉션
}
