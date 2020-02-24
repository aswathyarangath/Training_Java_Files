package file;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private transient String password;
	private Date birthday;
	private int age;
	public User(String username, String email, String password, Date birthday, int age) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
