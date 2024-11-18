package prac;

import java.util.Scanner;

public class prac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		if(num%2==0) {
				System.out.println("even");
			} else {
			System.out.println("odd");
			}

		
		///////
	
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		if (num%7==0 && num!=0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다.");
		}
		
		
		/////////
		
		
		int num = 0;
		for(int i=1; i<=1000; i++) {
			if(i%5==0) {
				num += i;
			}
		}
		System.out.println(num);
		
		
		///////
		
		
		System.out.print("1부터 50까지의 정수를 입력하세요 : ");
		int num = scanner.nextInt();
		if(num>=1 && num<=50) {
			for(int i=1; i<=num; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("1부터 50의 숫자가 아닙니다.");
		}
		
		
		///////
		
		
		int sum = 0;
		boolean run = true;
		int[] numArr = {1,2,3,4,5,6,7,8,9,10};
		while (run) {
			for(int i=0; i<numArr.length; i++) {
				if (numArr[i]%2==0) {
					sum -= numArr[i];
				} else if (numArr[i]%2==1) {
					sum += numArr[i];
				}
				run=false;
		}
		System.out.println(sum);
		}
		
		
		///////
		
		
	    int num = 0;
		for(int i=1; i<i+1; i++) {
			num += i;
			if(num>=1000) {
				break;
			}
		}
		System.out.println(num);
		
		
		////////
		
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}

		
		///////

		

			for (int x=1; x<=10; x++) {
				for(int y=1; y<=10; y++) {                    
					if((2*x)+(4*y)==10){
						System.out.println("("+x+","+y+")");
					}
				}
			}

		
		///////


		int selectNum = 0;
		int[] numArr = {0,0};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수2개입력 : ");
		for (int i=0; i<=1; i++) {
			selectNum = scanner.nextInt();
			numArr[i]=selectNum;
		}
		if(numArr[0]>numArr[1]) {
			System.out.println(numArr[0]+"-"+numArr[1]);
		} else {
			System.out.println(numArr[1]+"-"+numArr[0]);
		}

		
		/////////
		
		Scanner scanner = new Scanner(System.in);
		int selectNum = 0;
		int[] numArr = [4];
		int result =0;
		System.out.print("윳4개 입력하세요.(0:안 뒤집어진상태 1:뒤집어진상태) : ");
		for(int i=0; i<4; i++) {
			selectNum = scanner.nextInt();
			numArr[i]=selectNum;
		}
		result = (numArr[0])+(numArr[1])+(numArr[2])+(numArr[3]);
			if(result==1) {
				System.out.println("도");
		} else if(result==2) {
			System.out.println("개");
		} else if(result==3) {
			System.out.println("걸");
		} else if(result==4) {
			System.out.println("윳");
		} else {
			System.out.println("모");
		}
		
		
		
			
			//////////
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력 할 별 갯수 : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}

*/
		

//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
				
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력 : ");
//		int num = scanner.nextInt();
//		int x = 0;
//		for(x=1; x<x+1; x++) {
//			if((num%x)==0) {
//				System.out.println(x);
//			}
//		}

		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자 입력 : ");
//		int num = scanner.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<=num; i++) {
//			for(int j=i; j<num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		int num = 0;
//		for(int i=1; i<=10; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				
//				num = num + j;
//				
//			}
//		}	
//		System.out.println(num);
		
//		int i;
//		int total = 0;
//		for(i=1; total<100; i++) {
//			if(i%2 == 0) { //짝수 -
//				total = total - i;
//			}else { //홀수 +
//				total = total + i;
//			}
//		}
//		System.out.println("누적 합 : " + total + " 얼마까지 계산했는가 : " + (i-1));
		
		
		
//		int i=1;
//		int total = 0;
//		while(true) {
//			if(i%2==0) {
//				total=total-i;
//			}else {
//				total=total+i;
//			}
//			
//			
//			if(total >=100) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("누적 합 : " + total + " 얼마까지 계산했는가 : " + i);
		
		
		
		

	

	}
}
