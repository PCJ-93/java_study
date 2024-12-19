package cls.prac.prac01;

	public class Computer {
	
		int osIndex;
		int memory;
		public static final String[] OS_TYPE = { "윈도우10", "애플 OS X", "안드로이드" };
	
		public Computer(int osIndex, int memory) {
			this.osIndex = osIndex;
			this.memory = memory;
		}
	
		public void print() {
			System.out.printf("운영체제: %s, 메인메모리: %d\n", Computer.OS_TYPE[osIndex], memory);
		}

}
