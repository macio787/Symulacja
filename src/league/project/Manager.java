package league.project;

public class Manager extends People{
    private double charisma;
    private double managing;
    private double strategy;
    private double power;
    private String name;

    public Manager(String name){
        this.name=name;
        this.charisma=Math.random()*199+1;
        this.managing=Math.random()*199+1;
        this.strategy=Math.random()*199+1;
        this.power=(charisma+managing+strategy)/3;
    }
}
