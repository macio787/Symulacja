package league.project;

public abstract class People{
    private String name;

    public String getName(){return this.name;}

    public People(String name){
        this.name=name;
    }
    public People(){
        this.name=Names.getName();
    }
}
