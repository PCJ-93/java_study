package refer;

import java.util.Scanner;

public class refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 0;
//		int n;
//		
//		String s1;
//		String s2 = null;   //"" 안붙여도 됨 s2변수는 비어있다는 뜻
//		
//		//System.out.println(n);
//		System.out.println(num);
//		//System.out.println(s1);
//		System.out.println(s2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		
//		String str1 = "아침";
//		String str2 = "아침";
//		String str3 = scanner.nextLine();
//		String str4 = new String("아침");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str3 == str2);
//		System.out.println(str3.equals(str2));
//		
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4));
//		
//		String test = null;
//		System.out.println(test.equals("널이냐"));  //test변수 비어있는상태에서 연산 비교
		// NullpointerException 예시
		
		
		int n1 = 10;
		int n2 = n1;
		
		String ss1 = "점심";
		String ss2 = ss1;
		
		System.out.println(ss1.equals(ss2));
		
		
		
		

	}

}
