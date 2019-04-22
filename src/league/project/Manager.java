package league.project;

public class Manager extends People{
    private double charisma;
    private double managing;
    private double strategy;

    public Manager(String name){
        super(name);
        this.charisma=Math.random()*199+1;
        this.managing=Math.random()*199+1;
        this.strategy=Math.random()*199+1;
    }

    @Override
    public double getPower() {
        return (charisma+managing+strategy)/3;
    }
}
