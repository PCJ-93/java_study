package inter.inter02;

public interface Callable {
	
	//전화 상태 코드
	int CALL_ON = 1;  //전화중인상태
	public static final int CALL_OFF = 2;
	
	
	public void call();

}
