package prac;

public class prac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 아래 코드에서 예상되는 출력 결과를 작성하세요
//		int x = 2;
//		int y = 3;
//		int z;
//
//		System.out.println("x="+x + " y="+y);  // x=2y=3
//		System.out.println(x + y);    // 2+3 =5
//		System.out.println(x++ + y++);  // 2+3 = 5
//		System.out.println("x="+x + " y="+y);  // x=3y=4
//		z = ++x + ++y;						// z= 4+5  z=9
//		System.out.println("x="+x + " y="+y);   // x=4y=5
//		z--;                          // z=8
//		x += --y;                        // x=8        y=4
//		System.out.println("x="+x + " y="+y + " z="+z);  // x=8y=4z=8
//		x = 10;  // x10 y4 z8
//		z = x/y++;   // z=2 y=5 x=10
//		System.out.println("x="+x + " y="+y + " z="+z);   // x=10y=5z=2
//		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z); // x=20y=6z=2      y6
//		System.out.println("x="+x + " y="+y + " z="+z);  // x=10y=6z=2

//		2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		System.out.println( (a<b) && (c>=a) );           // true
//		System.out.println( (a == b ) || ( a >= b) || (c > 10) );          // false
//		boolean result = !(c == 3);
//		System.out.println( result );      // false
//
//		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.
//
//		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
//		6000원 이하 -> "훌륭"
//		6000원 초과 ~ 8000원 -> "선방"
//		8000원 초과 ~ 12000원 -> "눈물"
//		12000원 초과 -> "물로배채우기"
		
		int menuPrice = 15000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
//		String result = (menuPrice > 50000 ) ? "파산" : (menuPrice > 12000) ? "물로배채우기" : (menuPrice > 8000? "눈물" : (menuPrice > 6000 ? "선방" : "훌륭"));
		//왼쪽에서 부터 오른쪽으로 작성 
//		String result = (menuPrice > 20000) ? "파산" : (menuPrice > 12000) ? "물로배채우기" : (menuPrice > 8000) ? "눈물" : (menuPrice > 6000) ? "선방" :(menuPrice > 0 ? "훌륭" : "공짜");
		// 오른쪽에서 부터 왼쪽 방향으로 거꾸로 작성한 방법
		String result = (menuPrice <= 0) ? "굶음" : (menuPrice < 6000) ? "훌륭" : (menuPrice < 8000) ? "선방" : (menuPrice < 12000) ? "눈물" : (menuPrice < 20000) ? "물로배채우기" : "파산";
		// 작은 수  부터 시작한 방법
		System.out.println(result);
		
		
		
		
		
	}

}
