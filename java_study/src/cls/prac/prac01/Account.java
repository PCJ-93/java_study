package cls.prac.prac01;

public class Account {
	
	private String owner;
	private long balance;  // 잔액 int 보다 큰금액 저장(long)
	
	
	public Account() { 
		owner = null;  // 기본생성자여도 기본값 주는게 좋다!
		balance = 0;
	}
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	public long deposit(long amount) {
		balance += amount;
		return amount;
	}
//	public long withdraw(long amount) {
//		balance -= amount;
//		return amount;
//	}
	// 1) 잔액 부족 - > 출금 실패

	public long withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}else {
			balance -= amount;
			return amount;
		}
	}
	// 2) 잔액부족 - > 남은돈이라도 출금
//	public long withdraw(long amount) {
//		if(balance < amount) {
//			System.out.println("잔액부족. 남은잔액모두출금한다");
//			amount = balance;
//			balance = 0;
//			return amount;
//		}else {
//			balance -= amount;
//			return amount;
//		}
//	}
	
	

}
