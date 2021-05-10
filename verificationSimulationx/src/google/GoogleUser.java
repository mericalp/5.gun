package google;

public class GoogleUser {

	private String firstName;
	private String lastName;
	private String eMail;

	public GoogleUser() {
		
	}
	
	public GoogleUser(String firstName, String lastName, String eMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}
	
	public String getFirstName() {
		return firstName = "alp";
	}

	public String getLastName() {
		return lastName = "Ceren";
	}

	public String geteMail() {
		return eMail = "alp@hotmail.com";
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	
}