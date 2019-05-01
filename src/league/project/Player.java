package league.project;

import league.project.ITeam;
import league.project.People;

import java.util.Random;

public class Player extends People {
    private int pace;
    private int shoot;
    private int defence;
    private int passing;
    private int drible;
    private int physics;

    private int redCards;
    private int yellowCards;

    private ITeam team;

    public Player(String name){
        super(name);
        Random rand = new Random();
        this.pace = rand.nextInt(99)+1;
        this.shoot = rand.nextInt(99)+1;
        this.defence = rand.nextInt(99)+1;
        this.passing = rand.nextInt(99)+1;
        this.drible = rand.nextInt(99)+1;
        this.physics = rand.nextInt(99)+1;
    }
    public Player(){
        Random rand = new Random();
        this.pace = rand.nextInt(99)+1;
        this.shoot = rand.nextInt(99)+1;
        this.defence = rand.nextInt(99)+1;
        this.passing = rand.nextInt(99)+1;
        this.drible = rand.nextInt(99)+1;
        this.physics = rand.nextInt(99)+1;
    }

    @Override
    public double getPower(){return (pace+shoot+defence+passing+drible+physics)/6;}
    
    public void setRedCards(int redCards){this.redCards=redCards;}
    public int getRedCards(){return this.redCards;}
    public void setYellowCards(int yellowCards){this.yellowCards=yellowCards;}
    public int getYellowCards(){return this.yellowCards;}

}