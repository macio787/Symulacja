package league.project;

import java.util.ArrayList;
import java.util.Iterator;


public class League{
    private Team[] teamArray;
    private ArrayList<Week<Match>> weekList;
    private int numberOfTeams;
    private int numberOfMatches;
    private int numberOfWeeks;

    public League(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
        numberOfWeeks = (numberOfTeams - 1) * 2;
        numberOfMatches = numberOfTeams/2;

        teamArray = new Team[numberOfTeams];
        for(int i=0; i<numberOfTeams; i++)
            teamArray[i] = new Team();

        weekList = new ArrayList<>(numberOfWeeks);
        uniqueWeeks();
    }

    public static void main(String[] arg1){
        League mojaLiga = new League(10);
        mojaLiga.playLeague();
    }

    private void playLeague(){
        Iterator<Week<Match>> i = weekList.iterator();
        int weekNumber = 1;
        while(i.hasNext())
            System.out.println("### Week " + weekNumber++ + " ###\n" + i.next().playWeek() + "\n");
    }

    @SuppressWarnings("Duplicates")
    private void uniqueWeeks(){

        addEmptyWeeks();

        for(int i=0; i<this.numberOfTeams; i++)
            for(int j=0, weekCounter = 0; j<this.numberOfTeams; j++)
                if(j!=i){
                    Week<Match> week1 = weekList.get(weekCounter);
                    Week<Match> week2 = weekList.get(weekCounter+numberOfWeeks/2);
                    Match match1 = new Match( teamArray[Math.min(i,j)],teamArray[Math.max(i,j)] );
                    Match match2 = new Match( teamArray[Math.max(i,j)],teamArray[Math.min(i,j)] );
                    week1.add(match1);
                    week2.add(match2);
                    weekCounter++;
                }
    }

    private void addEmptyWeeks(){
        for(int i=0; i<numberOfWeeks; i++)
            weekList.add(new Week<>(numberOfMatches));
    }
}
