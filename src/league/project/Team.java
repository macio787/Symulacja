package league.project;

import java.util.Random;

import static league.project.TeamName.getTeamName;

public class Team{
                List<Player> players = new ArrayList<>();
                private int power;
                private int points;
                private int scoredGoals;
                private int lostGoals;
                private int wonMatches;
                private int lostMatches;
                private int draws;
                private String name;
                private Manager manager;


                public Team(){
                    Goalkeeper goalkeeper=new Goalkeeper();
                    players.add(goalkeeper);
                    for (int j=0; j<5;j++)
                    {
                        Defender defender=new Defender();
                        players.add(defender);
                    }
                     for (int i=0; i<5; i++)
                     { Attacker attacker=new Attacker();
                        players.add(attacker);
                     }
                    for (int i=0; i<3; i++)
                    { Midfielder midfielder=new Midfielder();
                        players.add(midfielder);;
                    }
                    manager = new Manager("name");


                }
                public double teamPowerGenerator(){
                    int totalpower = 0;
                    for (Player person : players) {
                        if (person.getRedCards()!=0)
                        totalpower += person.getPower();

                    }
                    totalpower += manager.getPower();
                    return totalpower/players.size();
                }
                public Team(String name){
                        this.name = name;
                }

                public Team(String name, int power){
                        this.name = name;
                        this.power = power;
                }

                public String getName(){
                        return name;
                }

                public int getPower() {
                        return power;
                }

                public void setPower(int power) {
                        this.power = power;
                }

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

                public void enterNewSeason() {
                        points = 0;
                        lostGoals = 0;
                        scoredGoals = 0;
                        lostMatches = 0;
                        wonMatches = 0;
                }

                public int getDraws() {
                        return draws;
                }

                public void addDraw() {
                        draws++;
                }

                public void reset(){
                    points = 0;
                    scoredGoals = 0;
                    lostGoals = 0;
                    wonMatches = 0;
                    lostMatches = 0;
                    draws = 0;
                }
        }
