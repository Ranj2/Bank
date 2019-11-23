
public class Variables implements GettersSetters {
	private String username;
	private String password;
	private int money;
	
	public void set_user(String user) {
		username = user;
	}
	public String get_user() {
		return username;
	}
	public void set_pass(String pass) {
		password = pass;
	}
	public String get_pass() {
		return password;
	}
	public void set_money(int mon) {
		this.money = mon;
	}
	public int get_money() {
		return money;
	}

}
