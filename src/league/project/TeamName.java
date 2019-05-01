package league.project;

public class TeamName {
    private static int i;
    private static char x = 'A';
    //private static String[] teamName= {"FC Barcfelona", "Mancwelster United", "WKS Śląsk Wrocław", "Legia Warszawa", "Real Madryt", "Juventus FC", "AC Milan", "Liverpool FC", "Cwelsea FC", "Mancwelster City"};
    public static String getTeamName(){
        /*if(i<10)
            return teamName[i++];
        return "No Name";*/

        return x++ + "";
    }
}