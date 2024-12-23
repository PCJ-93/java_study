package prac.prac02;

public class SuperTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
//		Orc o1 = new Orc("오크", 80);
//		OrcWarrior o2 = new OrcWarrior("오크전사", 120, 3);

//		System.out.println(o1.toString());
//		System.out.println(o2.toString());

		Orc[] OrcArr = { new Orc("오크", 80), new OrcWarrior("오크전사", 120, 3) };

		for (int i = 0; i < OrcArr.length; i++) {
			Orc tmp = OrcArr[i];
			System.out.println(tmp.toString());
		}
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return "Orc { name: " + name + ", hp: " + hp + " }";
	}
}

class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

// 메소드 오버라이딩!
	public String toString() {
		return String.format("OrcWarrior { name: %s , hp : %d , armor : %d }", name, hp, amor);
	}           
}
