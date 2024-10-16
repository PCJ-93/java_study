package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2 = 0b10;  // 2
		int num8 = 0010;  // 8
		int num10 = 10;  // 10
		int num16 = 0x30;  // 48
		
		System.out.println(num8);
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x01131;
		
		char var4 = 'D';  // 'AD' "D" 안됨
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴";
		String subMenu = "12342";   // 12342 숫자만 넣으면 String 타입에 안맞는다.
		
		System.out.println(menu);
		System.out.println(subMenu);
		
		System.out.println(var2 + 10);    // 86 + 10 = 96
		
		System.out.println(menu + subMenu); // 점심메뉴 + 12342  = 이어붙이는 역할
		System.out.println(subMenu + 500);
		
		String msg = "\"안녕\"\u3147 \n 하세요";
		System.out.println(msg);
		
		double d1 = 12.12;
		double d2 = 0.1212e2;
		float f1 = 12.12f;
		
		boolean stop = false;
		boolean open = true;
		boolean close = false;
		
		
		
		
	}

}
