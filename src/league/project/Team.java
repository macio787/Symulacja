package league.project;

import java.util.Random;

import static league.project.NamesGenerator.getTeamName;

public class Team implements ITeam{
                private int power;
                private int points;
                private int scoredGoals;
                private int lostGoals;
                private int wonMatches;
                private int lostMatches;
                private int draws;
                private String name;

                public Team(){
                        Random rand = new Random();
                        power = rand.nextInt(100) + 1;
                        this.name = getTeamName();
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
        }
