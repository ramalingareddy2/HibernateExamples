package com.otml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class Member implements Serializable{
	
	protected int memberId;
	protected String memberName;
	protected String projectName;
	protected String description;
	protected int experience;
	protected String role;
	protected Date startDate;
	protected List<Task> assignedTasks;
	
	

}
