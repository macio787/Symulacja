package league.project;

public class People implements IPeople {

    private int power;
    private ITeam team;

    public int getPower(){
        return this.power;
    };
    public ITeam getTeam(){
        return this.team;
    };
    public void setTeam(ITeam team){
        this.team=team;
    };
}
