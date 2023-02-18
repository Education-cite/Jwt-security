package com.security.jwt.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
public class User {
	
	   @Id
	    private String userName;
	    private String userFirstName;
	    private String userLastName;
	    private String userpassword;
	    
	    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinTable(name = "USER_ROLE",
	            joinColumns = {
	                    @JoinColumn(name = "USER_ID")
	            },
	            inverseJoinColumns = {
	                    @JoinColumn(name = "ROLE_ID")
	            }
	    )
	    
	    private Set<Role> role;
	    
	    

		public User() {

		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserFirstName() {
			return userFirstName;
		}

		public void setUserFirstName(String userFirstName) {
			this.userFirstName = userFirstName;
		}

		public String getUserLastName() {
			return userLastName;
		}

		public void setUserLastName(String userLastName) {
			this.userLastName = userLastName;
		}

		
		
		

		public String getUserpassword() {
			return userpassword;
		}

		public void setUserpassword(String userpassword) {
			this.userpassword = userpassword;
		}

		public Set<Role> getRole() {
			return role;
		}

		public void setRole(Set<Role> role) {
			this.role = role;
		}

		public User(String userName, String userFirstName, String userLastName, String userpassword, Set<Role> role) {
			super();
			this.userName = userName;
			this.userFirstName = userFirstName;
			this.userLastName = userLastName;
			this.userpassword = userpassword;
			this.role = role;
		}

		
	    
	    
	   
}
