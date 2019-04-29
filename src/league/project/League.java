package league.project;

import java.util.ArrayList;
import java.util.Scanner;

public class League{
    private Team[] teamArray;
    private ArrayList<Week<Match>> weekList;
    private int numberOfTeams;
    private int numberOfMatches;
    private int numberOfWeeks;

    public League(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
        numberOfMatches = (numberOfTeams+1)/2;
        numberOfWeeks = (numberOfMatches*2- 1) * 2;

        teamArray = new Team[numberOfTeams];
        for(int i=0; i<numberOfTeams; i++)
            teamArray[i] = new Team();

        weekList = new ArrayList<>(numberOfWeeks);
        uniqueWeeks();
    }

    public static void main(String[] arg1){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of teams in League (3-30): ");
        int inputInt = input.nextInt();
        League mojaLiga = new League(inputInt);
        mojaLiga.playLeague();
    }

    private void playLeague(){
        System.out.printf("\n\n#$#$#$#$# Sezon %d #$#$#$#$#\n\n", 1);
        for(int i=0; i<numberOfWeeks; i++) {
            Week<Match> playedWeek = weekList.get(i);
            System.out.println("### Week " + (i+1) + " ###\n" + playedWeek.playWeek());
        }
    }

    private void uniqueWeeks(){

        addEmptyWeeks();
        BergersPairs pairs = new BergersPairs();

        for(int weekNumber = 0; weekNumber < numberOfWeeks/2; weekNumber++)
            for(int matchNumber = 0; matchNumber < numberOfMatches; matchNumber++){
                int host = pairs.getPairMember(numberOfTeams);
                System.out.print(host);
                int guest = pairs.getPairMember(numberOfTeams);
                System.out.print(guest);
                if(host <= numberOfTeams && guest <= numberOfTeams) {
                    Match match1 = new Match(teamArray[host - 1], teamArray[guest - 1]);
                    Match match2 = new Match(teamArray[guest - 1], teamArray[host - 1]);
                    Week<Match> week1 = weekList.get(weekNumber);
                    Week<Match> week2 = weekList.get(weekNumber + numberOfWeeks/2);
                    week1.add(match1);
                    week2.add(match2);
                }
            }

    }

    private void addEmptyWeeks(){
        for(int i=0; i<numberOfWeeks; i++)
            weekList.add(new Week<>(numberOfMatches));
    }
}
