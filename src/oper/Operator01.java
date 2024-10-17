package oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술연산
		System.out.println(1+1);
		System.out.println(9-4);
		System.out.println(3*1);
		System.out.println(7/3.0);   // 앞에(double) 안붙이고 n.0 소숫점자리 입력해주면 실수로 출력됨
		System.out.printf("%.2f\n", 7/3.0);
		System.out.println(9%5);
		
		System.out.println("===============================================================");
		
		// 부호연산
		System.out.println(+10);
		System.out.println(-10);
		
		System.out.println("===============================================================");
		
		// 증감연산  ++, --   // 변수값 자체를 바꿈
		int x = 10;
		System.out.println( x-- );     // ++변수 : +를 먼저, 변수++ : +를 나중에
		System.out.println( x );
		
		int y = 20;
		System.out.println( ++y );
		System.out.println( y );
		
		int z = 30;
		System.out.println( z+1 );
		System.out.println( z );
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		
		System.out.println("===============================================================");
		
		// 논리부정연산자
		boolean isFinished = false;
		System.out.println( !isFinished );
		System.out.println( isFinished );
		// isSleep 자고있냐 잔다:true 안잔다:false <==> !isSleep : 자고있는게아니냐 잔다:false 안잔다: true
		
		System.out.println("===============================================================");
		
		// 비교연산자 ==, !=, >, <= ...   결과값이 true, false 로 출력
		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 3 < 5 );
		System.out.println( 4 <= 4 );
		System.out.println( 5 > 10 );
		System.out.println( 9 >= 8 );
		boolean b1 = ( 9 >= 8 );
		System.out.println(b1);
		
		System.out.println("===============================================================");
		
		// 논리연산자          && : and 연산자    || : or 연산자
		boolean b2 = ( 10 > 6 ) && ( 10 > 5 );
		//				true		   true
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1 ) || ( 10 < 4 );
		//              true          false
		System.out.println(b3);
		
		boolean b4 = ( 2 >= 1 ) && !( 3 < 4 );
		// 				true		 false
		System.out.println(b4);
		//System.out.println(!b4);
		
		System.out.println("===============================================================");
		
		// 복합대입연산자
		int a = 30;
		a += 30;  // a = a + 30;
		a -= 5;   // a = a - 5;
		a *= 3;   // a = a * 3;
		a /= 2;   // a = a / 2;
		a %= 4;   // a = a % 4;
		
		// a += 1;  =>  a = a + 1; 복합대입연산자는 가독성이 안좋아서 뒤에꺼 권장하는곳이 많다.
		
		System.out.println("===============================================================");
		
		// 삼항연산자
		int point = -10;
		// 0 ~ 200 : 생수
		// 201 ~  : 커피
		String eventItem = ( point <= 200 ) ? "생수" : "커피";
		System.out.println(eventItem);
		// eventItem = ( point > 200 ) ? "커피" : "생수";
		
		// 0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		// 301 ~    : 맥주
		eventItem = ( point > 200 ) ? ( point > 300 ? "맥주" : "커피" ) : "생수";
								   // 201~
		System.out.println(eventItem);
		
		eventItem = ( point > 200 ) ? ( ( point >= 201 && point <= 300 ) ? "맥주" : "커피" ) : "생수";
											//true        false = false
		// 점수가-n점이거나 잘못된값일때  (point >= 0 && point <= 200 )
		eventItem = ( point > 200 ) ? ( point > 300 ? "맥주" : "커피" ) : ( point >= 0 ? "생수" : "사은품없음" );
		System.out.println(eventItem);
		
		
		
	}

}
