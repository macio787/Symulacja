package league.project;

import league.project.ITeam;
import league.project.People;

import java.util.Random;
public class Player extends People {
    //chcemy raczej generować imiona i nazwiska ale możliwość dodania pojedynczych na +
    private String name;
    //popraw na pełne nazwy poniżej
    private int pace;
    private int shoot;
    private int defence;
    private int passing;
    private int drible;
    private int physics;
    private int power;
    private ITeam team;

    public Player(String name){
        Random rand = new Random();
        this.name = name;
        this.pace = rand.nextInt(99)+1;
        this.shoot = rand.nextInt(99)+1;
        this.defence = rand.nextInt(99)+1;
        this.passing = rand.nextInt(99)+1;
        this.drible = rand.nextInt(99)+1;
        this.physics = rand.nextInt(99)+1;
        this.power = (pace+shoot+defence+passing+drible+physics)/6;
    }

}