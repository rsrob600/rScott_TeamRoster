package com.codingdojo.web.models;

// Player JavaBean
public class Player implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	// Player member object variables
	private Integer player_id;
	private String first_name;
	private String last_name;
	private Integer age;

	// Constructors
	public Player() {
	}
	
	public Player(String firstN, String lastN, Integer age) {
		this.first_name = firstN;
		this.last_name = lastN;
		this.age = age;
		this.player_id++;
	}
	
	// getters and setters
	public void setPlayerId(Integer id) {
		this.player_id = id;
	}
	
	public Integer getPlayerId() {
		return player_id;
	}
	
	public void setFirstName(String firstN) {
		this.first_name = firstN;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setLastName(String lastN) {
		this.last_name = lastN;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
	
	
	
	
	
