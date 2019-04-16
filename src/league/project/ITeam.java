package league.project;

public interface ITeam {
        int getPower();
        void setPower(int power);
        int getPoints();
        void addPoints(int points);
        int getScoredGoals();
        void addScoredGoals(int scoredGoals);
        int getLostGoals();
        void addLostGoals(int lostGoals);
        int getWonMatches();
        void addWonMatch();
        int getLostMatches();
        void addLostMatch();
        void enterNewSeason();
        int getDraws();
        void addDraw();
        String getName();
}
