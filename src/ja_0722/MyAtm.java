package ja_0722;

//atm 만들기
                                                                                          

class ATM
{
		private int total;
		
		public ATM(int total) {
			this.total = total;
		}

	void deposit(int amount, String name) {
		
		total += amount;
		System.out.println(name+"님 입금내역 : "+ amount + "원");
	}

	void withdraw(int amount, String name) {
		
		if((total - amount)>0) { // 출금 가능하면
			total -= amount;
			System.out.println(name + " 님출금금액 : " + amount + "원");
		}else {
			System.out.println(name +  "님 잔액이 부족해 출금할 수 업습니다");
		}
		}
	
	public void getTotal() {
		System.out.println("\n 현재 계좌의 금액 : " + total + "\n");
	}

	}
	
	class ATM_USER extends Thread //ATM 사용자
	{
		boolean flag = false; //입금, 출금
		
		ATM obj;
		public ATM_USER(ATM obj, String name) {
			super(name);
			this.obj = obj;
		}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
			
			if(flag) {
				obj.deposit((int)(Math.random()*10000),getName());
				obj.getTotal();
			}else {
				obj.withdraw((int)(Math.random()*10000),getName());
				obj.getTotal();
			}
			flag = !flag;
	
		}
	}
}
	
public class MyAtm {

	public static void main(String[] args) {
		
		ATM atm = new ATM(10000); // 계좌에 10000원이 들어있음
		ATM_USER user1= new ATM_USER(atm, "사용자1");
		ATM_USER user2= new ATM_USER(atm, "사용자2");
		ATM_USER user3= new ATM_USER(atm, "사용자3");
		
		user1.start();
		user2.start();
		user3.start();
	}

}
