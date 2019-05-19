package league.project;

import java.util.Random;

public class Attacker extends Player {




        public Attacker(String name) {
            super(name);
            Random rand = new Random();
            this.pace = rand.nextInt(99) + 1;
            this.shoot = rand.nextInt(99) + 1;
            this.defence = rand.nextInt(99) + 1;
            this.passing = rand.nextInt(99) + 1;
            this.drible = rand.nextInt(99) + 1;
            this.physics = rand.nextInt(99) + 1;
        }

        public Attacker() {
            super();
            Random rand = new Random();
            this.pace = rand.nextInt(89) + 1;
            this.shoot = rand.nextInt(99) + 1;
            this.defence = rand.nextInt(29) + 1;
            this.passing = rand.nextInt(89) + 1;
            this.drible = rand.nextInt(99) + 1;
            this.physics = rand.nextInt(59) + 1;


        }
    @Override
        public double getPower(){return (pace+2*shoot+defence+passing+2*drible+physics)/8;}

    }
