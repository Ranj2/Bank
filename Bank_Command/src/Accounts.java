
public class Accounts extends Main {
	
	String name;
	String username;
	String password;
	Variables vb;
	
	
	public Accounts(String name,String username, String password,int money){
		
		this.name = name;
		vb.set_user(username);
		vb.set_pass(password);
		vb.set_money(money);
		
		
	}
	
	

}
