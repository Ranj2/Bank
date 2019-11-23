import java.util.Scanner;

public class Login extends Main {
	
	//overriding constructor
	
	Login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a Username :");
		String username = sc.next();
		System.out.print("Please Enter a Password :");
		String pass = sc.next();
		super.set_money(0);
		
		super.set_user(username);
		super.set_pass(pass);
	}
	Login(int a){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a Username :");
		String username = sc.next();
		System.out.print("Please Enter a Password :");
		String pass = sc.next();
		super.set_money(a);
		
		
		super.set_user(username);
		super.set_pass(pass);
		
	}

}
