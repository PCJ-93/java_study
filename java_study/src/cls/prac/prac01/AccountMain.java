package cls.prac.prac01;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account("이름",5000);
		System.out.println(a1.deposit(452433000) + " 원 입금 했다");
		System.out.println(a1.getBalance()+" 원 남았다");
		System.out.println(a1.withdraw(462433000) + " 원 출금 했다");
		System.out.println(a1.getBalance()+" 원 남았다");
		
	}

}
