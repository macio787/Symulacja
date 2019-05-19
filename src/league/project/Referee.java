package league.project;

public class Referee{

    public void bookPlayerRed(Player player) {
        int p=player.getRedCards();
        player.setRedCards(p+1);
    }

    public void bookPlayerYellow(Player player) {
        int p=player.getYellowCards();
        player.setYellowCards(p+1);
        if(player.getYellowCards() == 2)
            bookPlayerRed(player);
    }
}
