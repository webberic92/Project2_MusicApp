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
    private boolean subscription;

    public User() { }

public User(Long userid, String firstname, String lastname, String email, String password, boolean subscription) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.subscription = subscription;
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
public boolean isSubscription() {
return subscription;
}

public void setSubscription(boolean subscription) {
this.subscription = subscription;
}

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 79 * hash + Objects.hashCode(this.id);
//        hash = 79 * hash + Objects.hashCode(this.name);
//        hash = 79 * hash + this.population;
//        return hash;
//    }

  


	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.password != other.password) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        return Objects.equals(this.userid, other.userid);
    }

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", subscription=" + subscription + "]";
	}
    
}



