package iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 중첩반복문 예시
		
		for(int i=1; i<=5; i++) {
			//실행문
			System.out.println("for i 내부 실행문 시작" + i);
			for(int j=1; j<=3; j++) {
				System.out.println("for j 실행문" + j);
			}
			System.out.println("for i 내부 실행문 끝");
		}
		
		
		// 방3개  한번 통과할때마다
		// 2번쓸기
		// 3번닦기
		// 1번 쓰레기정리
		for (int i=1; i<=3; i++) {
			System.out.println("방통과"+i);
			int j=1;
			while(j<=2) {
				System.out.println("쓸기"+j);
				j++;
			}
			for(int k=1; k<=3; k++) {
				System.out.println("닦기"+k);
			}
			System.out.println("쓰레기정리");
		}
		
		

	}

}
