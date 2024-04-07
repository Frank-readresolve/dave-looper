package co.simplon.davelooper.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_accounts")
public class Account extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public Account() {
	// Default no-arg constructor
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    // @JsonIgnore
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Role getRole() {
	return role;
    }

    public void setRole(Role role) {
	this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) { // performance
	    return true;
	}
	// pattern matching
	return obj instanceof Account other
		&& Objects.equals(username, other.username);
    }

    @Override
    public int hashCode() {
	return Objects.hash(username);
    }

    @Override
    public String toString() {
	return "{username=" + username + ", password=" + password + ", role="
		+ role + "}";
    }
}
