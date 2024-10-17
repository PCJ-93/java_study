package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test";
		
		System.out.println("출력1");
		System.out.println("출력2");
		System.out.println(s);
		
		System.out.print("출력3");
		System.out.print("출력4");
		System.out.print(s);
		
		int hour = 10;
		int minute = 26;
		
		// 현재 10시 26분 입니다.
		System.out.println("현재 "+ hour + "시 "+ minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute); // %d정수형, %s문자형, %f실수형, %b불린형
		
		double rate = 1.15512;
		System.out.printf("%10.2f %%%%%%asd\n", rate);
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n", input);
		
		System.out.print("점수를 입력하세요 : ");
		int point = scanner.nextInt();  //scanner.nextDouble();
		System.out.println(point);
		
		
		
		
		
	}

}
