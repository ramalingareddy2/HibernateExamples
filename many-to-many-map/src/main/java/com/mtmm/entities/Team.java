package com.mtmm.entities;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;
@Data
public class Team implements Serializable{
	
	protected int teamNo;
	protected String teamName;
	protected String managerName;
	protected String coachName;
	Map<String, Player> players;

}
