package league.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import static league.project.NamesGenerator.getTeamName;

public class Team{
                private ArrayList<Player> players = new ArrayList<>();
                private int points;
                private int scoredGoals;
                private int lostGoals;
                private int wonMatches;
                private int lostMatches;
                private int draws;
                private String name;
                private Manager manager;


                public Team(){
                    name=getTeamName();
                    Goalkeeper goalkeeper=new Goalkeeper();
                    players.add(goalkeeper);
                    for (int j=0; j<5;j++)
                    {
                        Defender defender=new Defender();
                        players.add(defender);
                    }
                     for (int i=0; i<3; i++)
                     { Attacker attacker=new Attacker();
                        players.add(attacker);
                     }
                    for (int i=0; i<5; i++)
                    { Midfielder midfielder=new Midfielder();
                        players.add(midfielder);
                    }
                    manager = new Manager();
                }

                public Team(String name){
                    this.name=name;
                    Goalkeeper goalkeeper=new Goalkeeper();
                    players.add(goalkeeper);
                    for (int j=0; j<5;j++)
                    {
                        Defender defender=new Defender();
                        players.add(defender);
                    }
                    for (int i=0; i<3; i++)
                    { Attacker attacker=new Attacker();
                        players.add(attacker);
                    }
                    for (int i=0; i<5; i++)
                    { Midfielder midfielder=new Midfielder();
                        players.add(midfielder);
                    }
                    manager = new Manager();
                }

                public int getPower(){
                    int totalPower = 0;
                    for (Player person : players) {
                        if (person.getRedCards()!=0)
                        totalPower += person.getPower();
                    }
                    totalPower += manager.getPower();
                    return totalPower/(players.size()+1);
                }

                public void reset(){
                    points = 0;
                    scoredGoals = 0;
                    lostGoals = 0;
                    wonMatches = 0;
                    lostMatches = 0;
                    draws = 0;
                }

                public String getName(){
                        return name;
                }

                public ArrayList<Player> getPlayers(){return this.players;}

                public int getPoints() {
                        return points;
                }

                public void addPoints(int points) {
                        this.points += points;
                }

                public int getScoredGoals() {
                        return scoredGoals;
                }

                public void addScoredGoals(int scoredGoals) {
                        this.scoredGoals += scoredGoals;
                }

                public int getLostGoals() {
                        return lostGoals;
                }

                public void addLostGoals(int lostGoals) {
                        this.lostGoals += lostGoals;
                }

                public int getWonMatches() {
                        return wonMatches;
                }

                public void addWonMatch() {
                        wonMatches++;
                }

                public int getLostMatches() {
                        return lostMatches;
                }

                public void addLostMatch() {
                        lostMatches++;
                }

                public int getDraws() {
                        return draws;
                }

                public void addDraw() {
                        draws++;
                }

                public static ArrayList<Player> sortScorers(ArrayList<Player> players){
                    Collections.sort(players, (p1, p2) -> p2.getGoals()-p1.getGoals());
                    return players;
                }
        }
