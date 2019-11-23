import java.util.Scanner;

public class Main extends Variables {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] ranj) {
		
		
		
		
		System.out.println("-------------------Welcome to The G.O.A.T Bank----------------------");
		System.out.println("to register without adding money please enter 1");
		System.out.println("to register and add money please enter 2");
		
		Main m = new Main();
		m.register();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void register() {
		
		int choice = sc.nextInt();
		
			if(choice == 1) {
				Login log = new Login();
			}
			if(choice == 2) {
				System.out.println("Please enter amount you want to deposit :");
				int mon = sc.nextInt();
				Login log = new Login(mon);
				
			}
			else if (choice > 2||choice < 1){
				System.out.println("Wrong choice");
			}
			
			Transaction T = new Transaction();
		
			while(true) {
				System.out.println("-------------------Welcome to The G.O.A.T Bank----------------------");
			
			
			
			
				System.out.println("1.Know your current amount");
				System.out.println("2.deposit money");
				System.out.println("3.Withdraw Money");
				System.out.println("4.send money");
				choice = sc.nextInt();
		
				if(choice == 1) {
					System.out.println("Your Current Amount is: "+T.amount());
			
				}
				else if(choice ==2) {
				
				
					System.out.print("Enter Amount to Deposit:");
					int amount = sc.nextInt();
				
				
					T.deposit(amount);
				}
				else if(choice == 3) {
				
					System.out.print("Enter Amount to Withdraw:");
					int amount = sc.nextInt();
				
					T.withdraw(amount);
				
			}
		
		
		
		
		}
		
	}

	
	

}
