package com.codingdojo.web.models;

import java.util.ArrayList;

// Team JavaBean
public class Team implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	// Team member object variables
	private Integer team_id;
	private String team_name;
	private ArrayList<Player> team = new ArrayList<Player>();
	private Integer player_count;
	
	// Team Class variables
	private static ArrayList<Team> teamList = new ArrayList<Team>();
	
	
	// Constructors
	public Team() {
	}
	
	public Team(String teamN) {
		this.team_name = teamN;
		this.teamList.add(this);
		this.team_id++;
	}
	
	// getters and setters
	public void setTeamId(Integer teamId) {
		this.team_id = teamId;
	}
	
	public Integer getTeamId() {
		return team_id;
	}
	
	public void setTeamName(String teamN) {
		this.team_name = teamN;
	}
	
	public String getTeamName() {
		return team_name;
	}
	
	public void setPlayerCount(Integer playerC) {
		this.player_count = playerC;
	}
	
	public Integer getPlayerCount() {
		return player_count;
	}
	
	public static ArrayList<Team> getTeamList(){
		return teamList;
	}
	
	public ArrayList<Player> getTeam(){
		return team;
	}
	
	
	//-------------------------------Methods------------------------------
	
	public void addPlayer(String firstN, String lastN, Integer age) {
		Player player = new Player(firstN, lastN, age);
		this.team.add(player);
	}
	
	
	
	
}
