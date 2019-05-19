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
        createWeeks();

    }

    public static void main(String[] arg1){
        Scanner input = new Scanner(System.in);
        int inputInt, inputInt2;

        System.out.print("Number of teams in League (3-30): ");
        do {
            inputInt = input.nextInt();
        }while(inputInt <3 || inputInt > 30 );

        System.out.print("Number of seasons to play: ");
        do {
            inputInt2 = input.nextInt();
        }while(inputInt2 <= 0);

        League mojaLiga = new League(inputInt);

        for(int i=0; i<inputInt2; i++) {
            mojaLiga.playLeague(i);
        }
    }

    private void reset(){
        for (Team team : teamArray) {
            team.reset();
        }

        createWeeks();
    }

    private void playLeague(int numberOfSeason){
        System.out.printf("\n\n#$#$#$#$# Sezon %d #$#$#$#$#\n\n", numberOfSeason+1);
        for(int i=0; i<numberOfWeeks; i++) {
            Week<Match> playedWeek = weekList.get(i);
            System.out.println("### Week " + (i+1) + " ###\n" + playedWeek.playWeek());
        }
        System.out.printf(table());
        reset();
    }

    private void createWeeks(){
        weekList = new ArrayList<>(numberOfWeeks);
        uniqueWeeks();
    }

    private void uniqueWeeks(){

        addEmptyWeeks();
        BergersPairs pairs = new BergersPairs();

        for(int weekNumber = 0; weekNumber < numberOfWeeks/2; weekNumber++)
            for(int matchNumber = 0; matchNumber < numberOfMatches; matchNumber++){
                int host = pairs.getPairMember(numberOfTeams);
                int guest = pairs.getPairMember(numberOfTeams);
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

    private void sortTeams(){
        Team temp;

        for(int i=0; i < numberOfTeams-1; i++)
            for(int j=i+1; j < numberOfTeams; j++) {
                if (teamArray[i].getPoints() < teamArray[j].getPoints()) {
                    temp = teamArray[i];
                    teamArray[i] = teamArray[j];
                    teamArray[j] = temp;
                }
                else if(teamArray[i].getPoints() == teamArray[j].getPoints())
                    if (teamArray[i].getScoredGoals() - teamArray[i].getLostGoals() < teamArray[j].getScoredGoals() - teamArray[j].getLostGoals()) {
                        temp = teamArray[i];
                        teamArray[i] = teamArray[j];
                        teamArray[j] = temp;
                    }
            }
    }

    private String table(){
        sortTeams();
        String table = "";
        int longestName = 4;

        for(int i=0; i<numberOfTeams; i++)
            if(longestName < teamArray[i].getName().length())
                longestName = teamArray[i].getName().length();

        String teamName = "%-" + longestName + "s";
        teamName = String.format(teamName, "Team");
        table += String.format("%3s %s %-3s %-2s %-2s %-2s %-4s %-4s\n","", teamName,"P", "W", "D", "L", "SG", "LG");

        for(int i=0; i<numberOfTeams; i++){
            String temp = i+1 + ".";
            teamName = "%-" + longestName + "s";
            teamName = String.format(teamName, teamArray[i].getName());
            table += String.format("%3s %s %-3d %-2d %-2d %-2d %-4d %-4d\n",temp, teamName, teamArray[i].getPoints(), teamArray[i].getWonMatches(), teamArray[i].getDraws(), teamArray[i].getLostMatches(), teamArray[i].getScoredGoals(), teamArray[i].getLostGoals());
        }
        return table;
    }
}
