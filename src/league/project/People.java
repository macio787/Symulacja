package league.project;

public class People implements IPeople {

    private int power;
    private ITeam team;

    @Override
    public int getPower(){
        return this.power;
    };

    @Override
    public ITeam getTeam(){
        return this.team;
    }

    @Override
    public void setTeam(ITeam team) {
        this.team=team;
    }


    ;
}
