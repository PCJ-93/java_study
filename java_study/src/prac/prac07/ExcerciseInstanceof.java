package prac.prac07;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main

	private static void action(Robot robot) {
		
		if(robot instanceof DanceRobot) {
			DanceRobot asd = (DanceRobot)robot; // ((DanceRobot)robot).dance();
			asd.dance();
		}else if(robot instanceof SingRobot) {
			SingRobot asdf = (SingRobot)robot;  // ((SingRobot)robot).sing();
			asdf.sing();
		}else if(robot instanceof DrawRobot) {
			DrawRobot asdx = (DrawRobot)robot;  // ((DrawRobot)robot).draw();
			asdx.draw();
		}
	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}