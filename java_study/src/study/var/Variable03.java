package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 3.14;  // O
		double d2 = d1;
		
		int i1 = 30;   // O
		int i2 = i1;
		
		i2 = (int)d2;  // i2 = (int)3.14;
		              // i2 = 3;
		System.out.println(i2);
		
		// double -> int 로 변환 할때는 소수점 사라진다 int는 정수만 허용하기때문
		
		// java 정수 => int 인식
		// java 실수 => double 인식
		float f1 = 4.44f;
		double d3 = f1;  // double = float
		
		double d4 = 300;  // double = 정수형숫자(int) 자동타입변환
		// 300.0
		System.out.println(d4);
		
		// 연산에서의 형변환
		int intValue = 10;
		double doubleValue = 5.5;
		
//		int result = intValue + doubleValue;  // 잘못된 케이스
						// int + double -> double   ,  int + (int) double -> int
			// int = double
		
		int result = intValue + (int)doubleValue;
		  // int = int  +  (int)double       (int)5.5 -> 5
			// int = int + 5
		
		result = (int)(intValue + doubleValue);
		 	 //   2순위		  1순위
		// int 10  + double 5.5 -> double 15.5
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2;
		//           5  +    6    = 11
		System.out.println(rt);
		 	rt = (int)(dv1 + dv2);
		 	//           12.1   -> (int)12.1 = 12
		System.out.println(rt);
		
		
		
		
		
		
		
	}

}
