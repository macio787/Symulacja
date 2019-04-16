package league.project;

import java.util.Random;
public class Player extends People{
    //chcemy raczej generować imiona i nazwiska ale możliwość dodania pojedynczych na +
    private String name;
    //popraw na pełne nazwy poniżej
    private int pac;
    private int sho;
    private int def;
    private int pas;
    private int dri;
    private int phy;
    private int power;
    private ITeam team;

    public Player(String name){
        Random rand = new Random();
        this.name = name;
        this.pac = rand.nextInt(99)+1;
        this.sho = rand.nextInt(99)+1;
        this.def = rand.nextInt(99)+1;
        this.pas = rand.nextInt(99)+1;
        this.dri = rand.nextInt(99)+1;
        this.phy = rand.nextInt(99)+1;
        this.power = (pac+sho+def+pas+dri+phy)/6;
    }

}