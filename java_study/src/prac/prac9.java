package prac;

import java.util.Scanner;

public class prac9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int a = 0;
		int b = 0;
		
			for(a=1; a<=6; a++){
				for(b=1; b<=6; b++) {
					if(a+b==6) {
					System.out.print("a:"+a);
					System.out.println(" b:"+b);
					}
				}
			}


		int[] lotto = new int[6];
		int index = 0;
		boolean isDuplicated = false;
		
		while(true) {
			int value = (int)(Math.random()*45)+1;
			
			isDuplicated = false;
			
			for(int i=0; i<index; i++) {
				if(lotto[i] == value) {
					isDuplicated = true;
					break;
				}
			}

			if(isDuplicated ) {
				continue;
			}else {
				lotto[index] = value;
				index++;
			}
			if(index == 6) {
				break;
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	

		
			
		int[] class1 = new int[5];
		int[] class2 = new int[5];
		int[] class3 = new int[5];
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<class1.length; i++) {
			System.out.print("1반입력 : ");
			int point = scanner.nextInt();
			class1[i] = point;
			result1 += point;
		}
		for(int i=0; i<class1.length; i++) {
			System.out.print("2반입력 : ");
			int point = scanner.nextInt();
			class2[i] = point;
			result2 += point;
		}
		for(int i=0; i<class1.length; i++) {
			System.out.print("3반입력 : ");
			int point = scanner.nextInt();
			class3[i] = point;
			result3 += point;
		}
		System.out.println("===================================");
		System.out.println("1반평균: "+(double)result1/class1.length);
		System.out.println("2반평균: "+(double)result2/class2.length);
		System.out.println("3반평균: "+(double)result3/class3.length);
		System.out.println("전체평균: "+(double)(result1+result2+result3)/(class1.length+class2.length+class3.length));
*/			

		
		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };
		int[][] newArr = new int[4][4];  //arr.length+1  arr[0].length+1
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j];
				
				newArr[i][3] += arr[i][j];
				newArr[3][j] += arr[i][j];
				newArr[3][3] += arr[i][j];
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
/*
		int[][] arr =
			{
			{10, 20, 30},
			{20, 30, 40},
			{30, 40, 50}
			};
		int[][] arr2 = new int[4][4];
		int sum = 0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(j<3 && i<3) {
				arr2[i][j] = arr[i][j];
				sum += arr[i][j];
				System.out.print(arr2[i][j]);
				}else {
					arr2[i][j] = sum;
					sum = 0;
					System.out.print(arr2[i][j]);
					System.out.println();
				}
			}
		}
		
*/
		
		
		
			
	}
}
