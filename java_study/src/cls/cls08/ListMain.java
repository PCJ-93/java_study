package cls.cls08;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[4];

		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		arr[2] = null;

		for (String item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();

		ArrayList<String> list = new ArrayList<String>();

		list.add("곱창"); // 배열에 값넣기
		list.add("목살");
		list.add("순대");
		list.add(0, "대창"); // 배열에 값 추가
		list.add(3, "삼겹살");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// list.set(2, null);
		list.remove(2);
		list.remove("대창");

		for (String item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		

	}

}
