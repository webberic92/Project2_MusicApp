package com.deadduck.Project2MUSICAPP.bean;



import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;
	private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Long subscription_id;

    public User() { }
    

	public User(Long userid, String firstname, String lastname, String email, String password, Long subscription_id) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.subscription_id = subscription_id;
	}


    
    public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Long getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(Long subscription_id) {
		this.subscription_id = subscription_id;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", subscription_id=" + subscription_id + "]";
	}


}



