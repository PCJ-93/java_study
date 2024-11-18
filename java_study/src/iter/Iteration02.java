package iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 for (초기; 조건; 증감){
		 	실행문;
		 }
		  
		 while (조건) {  조건이 true일때 반복
		 	실행문;
		 }
		  
		  
		 
		 */
		//5번만 출력
		for(int i=1; i<=5; i++) {
			System.out.println("피곤하다");
		}
		
		int j = 1;
		while (j<=5) {
			System.out.println("졸리다");
			j++;  // j에 증감이나 연산식 걸어 줘서 조건식이 false로 바뀔수 있게 해줌
		}
		
//		while(true) {
//			System.out.println("무한");
//		}
		
		int k = 5;
		do {
			System.out.println("k do while");
		} while (k<5);
		
		
		k = 1;
		while(true) {
			
			
			k++;
			
			if (k == 10) {
				break;  // 조건이 맞을때 멈추기
				}
			
			System.out.println(k);
			
			
			
		}
		System.out.println("끝남브레이========================================================");
		
		
		
		for (int i=1; i<=10; i++) {
			
			if (i==5)
				continue;           //조건이 맞을때 밑에있는 실행문을 건너뜀
				
				System.out.println(i);
				
				if(i==5)            // 실행문 건너뛰어서 브레이크가 실행안됨
					break;
		}
		
		
		
		
		
		
	}

}
