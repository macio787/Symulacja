package league.project;

import java.util.Random;

public class Midfielder extends Player {
    public Midfielder (String name) {
        super(name);
        Random rand = new Random();
        this.pace = rand.nextInt(99) + 1;
        this.shoot = rand.nextInt(99) + 1;
        this.defence = rand.nextInt(99) + 1;
        this.passing = rand.nextInt(99) + 1;
        this.drible = rand.nextInt(99) + 1;
        this.physics = rand.nextInt(99) + 1;
    }

    public Midfielder() {
        super();
        Random rand = new Random();
        this.pace = rand.nextInt(99) + 1;
        this.shoot = rand.nextInt(79) + 1;
        this.defence = rand.nextInt(49) + 1;
        this.passing = rand.nextInt(99) + 1;
        this.drible = rand.nextInt(79) + 1;
        this.physics = rand.nextInt(69) + 1;


    }
    @Override
    public double getPower(){return (2*pace+shoot+defence+2*passing+drible+physics)/8;}
}
