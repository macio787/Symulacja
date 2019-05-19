package league.project;

import java.util.ArrayList;
import java.util.Random;

public class Match {
    private TeamInMatch host;
    private TeamInMatch guest;
    private int totalPower;
    private Boolean wasPlayed;

    public Match(Team host, Team guest){
        this.host = new TeamInMatch(host);
        this.guest = new TeamInMatch(guest);
        totalPower = host.getPower() + guest.getPower();
        wasPlayed = false;
    }

    public String playMatch(){
        if(wasPlayed)
            return getResult();

        for(int i = 0; i < 90; i++)
            matchMinute();

        reward();
        wasPlayed = true;

        return getResult();
    }

    private void matchMinute(){
        Random rand = new Random();
        int roll = rand.nextInt(totalPower) + 1;
        if(roll <= host.team.getPower())
            if (hasScored(host, guest))
                host.addGoal();
        else
            if (hasScored(guest, host))
                guest.addGoal();
    }

    private Boolean hasScored(TeamInMatch attacking, TeamInMatch defending){

            final int x = 4;
            Random rand = new Random();
            int roll = rand.nextInt(100);
            if(roll<x)
                return true;
            else
                return false;
    }

    private void reward(){
        if(host.getGoals() > guest.getGoals()){
            host.team.addWonMatch();
            guest.team.addLostMatch();
            host.team.addPoints(3);
        }
        else if(host.getGoals() == guest.getGoals()){
            guest.team.addDraw();
            host.team.addDraw();
            guest.team.addPoints(1);
            host.team.addPoints(1);
        }
        else{
            guest.team.addWonMatch();
            guest.team.addPoints(3);
            host.team.addLostMatch();
        }
        host.team.addScoredGoals(host.getGoals());
        host.team.addLostGoals(guest.getGoals());
        guest.team.addScoredGoals(guest.getGoals());
        guest.team.addLostGoals(host.getGoals());
    }

    public String getResult(){
        return host.team.getName() + " " + host.getGoals() + ":" + guest.getGoals() + " " + guest.team.getName();
    }
}

class TeamInMatch{
    Team team;
    private int goals;

    public TeamInMatch(Team team){
        this.team = team;
    }

    void addGoal() {
        goals++;

        Random rand = new Random();
        int goalChance = rand.nextInt(99)+1;
        int player = rand.nextInt(10);
        ArrayList<Player> players = team.getPlayers();
        while(goalChance <= players.get(player).shoot)
        {
            player = rand.nextInt(10);
            goalChance = rand.nextInt(99)+1;
        }
        Player scorer=players.get(player);
        scorer.setGoals(scorer.getGoals()+1);
    }

    int getGoals() {
        return goals;
    }
}

