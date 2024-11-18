package prac;

import java.util.Scanner;

public class pracArr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("몇번째 수인가요? : ");
//		int num = scanner.nextInt();
//		
//		int[] num1 = {10,20,30,50,90};
//		if (num==1) {
//			System.out.println(num1[0]);
//		} else if (num==2) {
//			System.out.println(num1[1]);
//		} else if (num==3) {
//			System.out.println(num1[2]);
//		} else if (num==4) {
//			System.out.println(num1[3]);
//		} else if (num==5) {
//			System.out.println(num1[4]);
//		} else {
//			System.out.println("잘못입력함");
//		}
		//SOL  -- 입력받아쓰라했음(scanner)
//		Scanner scanner = new Scanner(System.in);
//		int[] numArr = new int[5];
//		System.out.print("5개 정수를 입력하세요 : ");
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=scanner.nextInt();
//		}
//		System.out.println("몇번째 수인가요? : ");
//		int index = scanner.nextInt();
//		System.out.println("결과 : "+numArr[index-1]);
		

		
//		System.out.print("첫번째 숫자를 입력 하세요 : ");
//		int num1 = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력 하세요 : ");
//		int num2 = scanner.nextInt();
//		System.out.print("세번째 숫자를 입력 하세요 : ");
//		int num3 = scanner.nextInt();
//		System.out.print("네번째 숫자를 입력 하세요 : ");
//		int num4 = scanner.nextInt();
//		System.out.print("다섯번째 숫자를 입력 하세요 : ");
//		int num5 = scanner.nextInt();
//		int[] totalArr = {num1,num2,num3,num4,num5};
//		System.out.println(totalArr[4]+" "+totalArr[3]+" "+totalArr[2]+" "+totalArr[1]+" "+totalArr[0]);
		//SOL
//		Scanner scanner = new Scanner(System.in);
//		int[] numArr = new int[5];
//		System.out.print("5개 정수를 입력하세요 : ");
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = scanner.nextInt();
//		}
//		System.out.print("결과 : ");
//		for (int i=4; i>=0; i--) {
//			System.out.print(numArr[i]+" ");
//		}
		
//		System.out.print("5개 정수를 입력하세요 : ");
//		for (int i=4; i>=0; i--) {
//			numArr[i] = scanner.nextInt();
//		}
//		System.out.print("결과 : ");
//		for(int i=0; i<numArr.length; i++) {
//			System.out.print(numArr[i]+" ");
//		}
		
		
		
		
//		int[][] numArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		for(int i =0; i<numArr[0].length; i++) {
//			for( int j=0; j<numArr[0].length; j++) {
//			System.out.print(numArr[i][j]+" ");
//		}
//			System.out.println();
//		}
		//SOL
		//int[][] nArr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] nArr = new int[4][4];
		int num =1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				nArr[i][j] = num++;
				//num = num+1;
			}
		}
			

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//System.out.print(nArr[i][j]+" ");
				System.out.printf("%3d",nArr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
