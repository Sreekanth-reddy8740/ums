package org.sreekanth.ums.Dto;

import java.io.Serializable;

public class RegisterDto implements Serializable {

	private String firstname;
	
	private String contactnumber;
	
	private String email;
	
	private String password;
	
	private String country;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDto [firstname=" + firstname + ", contactnumber=" + contactnumber + ", email=" + email
				+ ", password=" + password + ", country=" + country + "]";
	}
	
}
