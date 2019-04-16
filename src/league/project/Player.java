package league.project;

public class Player extends People{
    private String name;
    private double pac;
    private double sho;
    private double def;
    private double pas;
    private double dri;
    private double phy;
    private double power;
    private ITeam team;

    public Player(String name){
        this.name=name;
        this.pac=Math.random()*99+1;
        this.sho=Math.random()*99+1;
        this.def=Math.random()*99+1;
        this.pas=Math.random()*99+1;
        this.dri=Math.random()*99+1;
        this.phy=Math.random()*99+1;
        this.power=(pac+sho+def+pas+dri+phy)/6;
    }
}
