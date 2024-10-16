package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//변수선언	
		int number1;   // int : 정수형 숫자 변수
		int floor;     //선언만 해서 값이 없는상태.
		
		int x,y,z;
	/*	int x;
		int y;
		int z;
	*/
		
	//	int int;  변수에 예약어 사용X
		
		int score;  //선언
		int point = 50; //선언 + 값 저장 = 초기화
		
		score = 90;  // 선언후 초기화
		
		// level = 99;  선언하지 않은 변수명 사용 불가능
		
		// time = 16;   // 변수 선언 이전에는 사용 불가능
		int time;
		time = 16;   // 변수 선언 이후에 사용 가능
		
		int minutes = time + 9;
					// 16 + 9
		
	//	int myFloor = floor + 7;  값이 없는 변수를 계산할수 없다.
		
		int totalScore = point + point + point + score + score;
		
		System.out.println( "출력합니다." );  // 자동완성 sysout -> ctrl + spacebar
		System.out.println( minutes );   
		System.out.println( totalScore );
		System.out.println( totalScore + point );
		
		System.out.println( totalScore );
		totalScore = totalScore + point;
		// totalScore =  330  +  50
		System.out.println( totalScore );
		
		
		x = 10;
		y = x;
		z = x + y;


		int a = 10;
		int b = 20;
		
		// a : 10 , b : 20  인데
		// a : 20 , b : 10  으로 바꾸려면
		
//		a=b; // a:20 b:20  이방법은 실패
//		b=a; // a:20 b:20
		
		int c = a; // a:10 b:20 c:10
		
		a=b;  // a:20 b:20 c:10
		b=c;  // a:20 b:10 c:10
		System.out.println(c);
		
		
		
	}

}
