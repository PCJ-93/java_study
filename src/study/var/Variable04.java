package study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "1231";
		
		int n1 = 50;
		int n2 = Integer.parseInt(s1);
		
		System.out.println( s1 + n1 );
		
		System.out.println( n1 + n2 );
		
		System.out.println(n1 + Integer.parseInt(s1));
		
		String s2 = "13.13";
//		int n3 = Integer.parseInt(s2);   오류    13.13은 실수라서 정수만받는 int에 못들어감
		double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
		boolean b1 = true;
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3);
		System.out.println(b2);
		
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(123);
		String s6 = String.valueOf(88.9901);
		
		
		
		
	}

}
