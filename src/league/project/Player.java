package league.project;

import java.util.Random;

 public abstract class Player extends People {
    protected int pace;
    protected int shoot;
    protected int defence;
    protected int passing;
    protected int drible;
    protected int physics;
    protected int redCards;
    protected int yellowCards;
    private int goals;


    public Player(String name){
        super(name);
        Random rand = new Random();
        this.pace = rand.nextInt(99)+1;
        this.shoot = rand.nextInt(99)+1;
        this.defence = rand.nextInt(99)+1;
        this.passing = rand.nextInt(99)+1;
        this.drible = rand.nextInt(99)+1;
        this.physics = rand.nextInt(99)+1;
        this.goals=0;
    }
    public Player(){
        super();
        Random rand = new Random();
        this.pace = rand.nextInt(99)+1;
        this.shoot = rand.nextInt(99)+1;
        this.defence = rand.nextInt(99)+1;
        this.passing = rand.nextInt(99)+1;
        this.drible = rand.nextInt(99)+1;
        this.physics = rand.nextInt(99)+1;
        this.goals=0;
    }

    public double getPower(){return (pace+shoot+defence+passing+drible+physics)/6;}
    
    public void setRedCards(int redCards){this.redCards=redCards;}
    public int getRedCards(){return this.redCards;}
    public void setYellowCards(int yellowCards){this.yellowCards=yellowCards;}
    public int getYellowCards(){return this.yellowCards;}
    public int getGoals(){return this.goals;}
    public void setGoals(int g){this.goals=g;}
}