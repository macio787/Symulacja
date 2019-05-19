package league.project;

import java.util.Random;

public class Goalkeeper extends Player {
    public Goalkeeper(String name) {
        super(name);
        Random rand = new Random();
        this.pace = rand.nextInt(99) + 1;
        this.shoot = rand.nextInt(99) + 1;
        this.defence = rand.nextInt(99) + 1;
        this.passing = rand.nextInt(99) + 1;
        this.drible = rand.nextInt(99) + 1;
        this.physics = rand.nextInt(99) + 1;
    }

    public Goalkeeper() {
        Random rand = new Random();
        this.pace = rand.nextInt(29) + 1;
        this.shoot = rand.nextInt(29) + 1;
        this.defence = rand.nextInt(99) + 1;
        this.passing = rand.nextInt(59) + 1;
        this.drible = rand.nextInt(59) + 1;
        this.physics = rand.nextInt(99) + 1;


    }
    @Override
    public double getPower(){return (pace+shoot+3*defence+passing+drible+physics)/8;}
}
