package com.otml.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task implements Serializable{
	
	protected int taskNo;
	protected String title;
	protected int duration;
	protected String description;
	protected String status;
	

}
