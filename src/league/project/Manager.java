package league.project;

import java.util.Random;

public class Manager extends People{
    private int charisma;
    private int managing;
    private int strategy;

    public Manager(){
        super();
        Random rand=new Random();
        this.charisma=rand.nextInt(199)+1;
        this.managing=rand.nextInt(199)+1;
        this.strategy=rand.nextInt(199)+1;
    }

    public Manager(String name){
        super(name);
        Random rand=new Random();
        this.charisma=rand.nextInt(199)+1;
        this.managing=rand.nextInt(199)+1;
        this.strategy=rand.nextInt(199)+1;
    }

    public double getPower() { return (charisma+managing+strategy)/3; }
}
