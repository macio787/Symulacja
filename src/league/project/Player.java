package league.project;
public class Player extends People{
    private String name;
    private int pac;
    private int sho;
    private int def;
    private int pas;
    private int dri;
    private int phy;
    private int power;
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