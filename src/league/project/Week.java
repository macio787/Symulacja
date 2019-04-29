package league.project;

import java.util.ArrayList;

public class Week<E> extends ArrayList implements IWeek{
    private Boolean wasPlayed;

    public Week(int numberOfMatches){
        super(numberOfMatches);
        wasPlayed = false;
    }

    public String playWeek() {
        if(wasPlayed)
            return getResult();

        for (Match match : (Iterable<Match>) this)
            match.playMatch();

        wasPlayed = true;

        return getResult();
    }

    public String getResult() {
        String result = "";
        for (Match match : (Iterable<Match>) this)
            result += (match.getResult() + "\n");

        return result;
    }
}
