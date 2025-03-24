package br.edu.fateccotia.tasklist.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tokens")
public class Token {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String token;
	@ManyToOne
	private User user;
	private Long expirationTime;
	
	public Token() {
		
	}
	
	public Token(Integer id, String token, br.edu.fateccotia.tasklist.model.User user, Long expirationTune) {
		super();
		Id = id;
		token = token;
		user = user;
		expirationTune = expirationTune;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		user = user;
	}

	public Long getExpirationTune() {
		return expirationTime;
	}

	public void setExpirationTune(Long expirationTune) {
		expirationTune = expirationTune;
	}
	
	
	

}
