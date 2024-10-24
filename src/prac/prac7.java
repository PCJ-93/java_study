package prac;

import java.util.Scanner;

public class prac7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수: ");
		int guk = scanner.nextInt();
		System.out.println("수학점수: ");
		int suhak = scanner.nextInt();
		System.out.println("영어점수: ");
		int eng = scanner.nextInt();
		
		int[] scoreArr = {guk, suhak, eng};
		
		int total = scoreArr[0]+scoreArr[1]+scoreArr[2];
		
		if ((double)total/3<60||(scoreArr[0]<40)||(scoreArr[1]<40)||(scoreArr[2]<40)) {
			System.out.println("불합격입니다.");
		} else if ((double)total/3>=60||(scoreArr[0]>40)||(scoreArr[1]>40)||(scoreArr[2]>40)) {
			System.out.println("국어점수 : "+guk);
			System.out.println("수학점수 : "+suhak);
			System.out.println("영어점수 : "+eng);
			System.out.println("합계 : "+total);
			System.out.println("평균 : "+(double)total/3);
			System.out.println("축하합니다. 합격입니다!");
		}

		
		
		
		
		
		
		
		
	}
}


