package com.mtmm.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Player implements Serializable{
	
	protected int playerNo;
	protected String playerName;
	protected int age;
	protected String gender;

}
