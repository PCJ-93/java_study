package inter.inter02;

public class InterMain {

	public static void main(String[] args) {

		Person p = new Person();

		p.callPhone = new IPhone();
		p.call("123123123");

		p.callPhone = new GalaxyPhone();
		p.call("123123");

		p.callPhone = new LGPhone();
		p.call("213");

	}

}
