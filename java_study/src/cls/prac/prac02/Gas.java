package cls.prac.prac02;

public class Gas {
	
	int gu;
	int fireCnt;
	
	public void onFire() {
		System.out.println("불을켠다");
	}
	public void offFire() {
		System.out.println("불을끝다");
	}
	
	public int fireUpDown(int fireCnt) {
		return this.fireCnt += fireCnt;
	}

}
