package com.mtmm.test;

import java.util.HashMap;
import java.util.Map;

import com.mtmm.dao.TeamDao;
import com.mtmm.entities.Player;
import com.mtmm.entities.Team;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TeamDao dao=new TeamDao();
    	
//    	Player player1=new Player();
//    	player1.setAge(30);
//    	player1.setGender("Male");
//    	player1.setPlayerName("Sachin Tendulkar");
//    	
//    	Player player2=new Player();
//    	player2.setAge(28);
//    	player2.setGender("Male");
//    	player2.setPlayerName("Rahul Dravid");
//    	
//    	int playerNo1=dao.save(player1);
//    	int playerNo2=dao.save(player2);
//    	
//    	System.out.println("playerNo1-"+playerNo1+"   PlayerNo2-"+playerNo2);
//    	
//    	Map<String, Player> players=new HashMap<>();
//    	players.put("M1001", player1);
//    	players.put("M3002", player2);
//    	
//    	Team team=new Team();
//    	team.setTeamName("Mumbai Indians");
//    	team.setPlayers(players);
//    	team.setManagerName("Ramalinga");
//    	team.setCoachName("Irfan Pathan");
//    	
//    	int teamNo=dao.save(team);
//    	
//    	System.out.println("Team No -"+teamNo);
    	
    	
    	
    	System.out.println(dao.findObject(1, Team.class));
    	
        System.out.println( "Hello World!" );
    }
}
