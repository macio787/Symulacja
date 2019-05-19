package league.project;

public abstract class People implements IPeople {

    private ITeam team;
    private String name;

    @Override
    public ITeam getTeam(){
        return this.team;
    }

    @Override
    public void setTeam(ITeam team) {
        this.team=team;
    }

    @Override
    public String getName(){return this.name;}

    public People(String name){
        this.name=name;
    }
    public People(){
        this.name= NamesGenerator.getName();
    }
}
