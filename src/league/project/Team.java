package league.project;

import java.util.Random;

        public class Team implements ITeam{
                private int power;
                private int points;

                public Team(){
                        Random rand = new Random();
                        power = rand.nextInt(100) + 1;
                        points = 0;
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
        }
