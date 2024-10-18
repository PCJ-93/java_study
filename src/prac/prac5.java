package prac;

import java.util.Scanner;

public class prac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 10;
//		System.out.println((num>0)?"\"양수\"":"\"음수\"");
//		System.out.println((num<0)?"\"양수\"":"\"음수\"");
//		System.out.println((num>0)?"\"0\"":"false");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int input = scanner.nextInt();
		System.out.println("입력한 숫자 = "+input);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int input2 = scanner.nextInt();
		System.out.println("입력한 숫자 = "+input2);
		
		
		System.out.printf( "더하기 : %s + %s = %s \n",input,input2,(input+input2));
		System.out.println( "빼기 : " + input + " - " + input2 + " = " + (input-input2));
		System.out.printf( "곱하기 : %s * %s = %s \n",input,input2,(input*input2));
		System.out.printf( "나누기 : %s / %s = %.3f \n",input,input2,((double)input/input2));
		
		
		
		
		System.out.println("===========================================================");
		
		int num = 1;
		System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : "0") );
		System.out.println( num == 0 ? "0" : (num > 0 ? "양수" : "음수" ));
		
		
		
		
		
		
		

	}

}
