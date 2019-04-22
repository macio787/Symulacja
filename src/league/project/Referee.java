package league.project;

public class Referee implements IReferee{

    @Override
    public void bookPlayerRed(Player player) {
        int p=player.getRedCards();
        player.setRedCards(p+1);
    }

    @Override
    public void bookPlayerYellow(Player player) {
        int p=player.getYellowCards();
        player.setYellowCards(p+1);
    }
}
