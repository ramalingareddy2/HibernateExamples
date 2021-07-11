package com.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.otml.dao.MemberDao;
import com.otml.entities.Member;
import com.otml.entities.Task;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MemberDao memberDao=new MemberDao();
    	/*Task task=Task.builder().title("BugFix").duration(2).description("Bug Fix for Parent and Child Org timezone issue").status("Assigned").build();
    	Task task1=Task.builder().title("Sonar Scan Fixs").duration(2).description("Sonar Scan fix issues").status("Assigned").build();
    	
    	memberDao.saveTask(task);
    	memberDao.saveTask(task1);
    	
    	Member member=new Member();
    	member.setMemberName("Robert");
    	member.setProjectName("Ad Platforms");
    	member.setRole("Sr.Engineer");
    	member.setDescription("Good at Java and J2EE");
    	member.setExperience(6);
    	member.setStartDate(new Date());
    	List<Task> tasksAssigned=new ArrayList<>();
    	tasksAssigned.add(task);
    	tasksAssigned.add(task1);
    	member.setAssignedTasks(tasksAssigned);
    	
    	memberDao.saveMember(member);
    	*/
    	
    	Task task=memberDao.findTaskById(1);
    	
    	System.out.println(task);
    	
    	Member member=memberDao.findMemberById(1);
    	System.out.println(member);
    	
    }
}
