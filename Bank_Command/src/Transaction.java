
public class Transaction extends Main {
	
	void deposit(int a){
		
		if(a > 0) {
			
			int am = a+get_money();
			super.set_money(am);
			System.out.println(super.get_money());
		}
		else {
			System.out.println("please enter a valid amount");
		}
		
		
	}
	void withdraw(int a) {
		
		if(a <= get_money()) {
			super.set_money(get_money()-a);
		}else {
			System.out.println("Please Enter A valid amount");
			System.out.println("Your current amount is "+super.get_money());
		}
	}
	int amount() {
		return super.get_money();
	}
	
	


}
