package eticaretExample.entities.concretes;

import eticaretExample.entities.abstracts.Entitiy;

public class User implements Entitiy{
	private int userId;
	private String firstName;
	private String lastName;
	private String password;
	private String eMail;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String firstName, String lastName, String password, String eMail) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
