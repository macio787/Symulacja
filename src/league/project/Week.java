package league.project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Week<E> extends HashSet implements IWeek{
    private Boolean wasPlayed;

    public Week(int numberOfMatches){
        super(numberOfMatches);
        wasPlayed = false;
    }

    public String playWeek() {
        if(wasPlayed)
            return getResult();

        Iterator<Match> i = this.iterator();
        while(i.hasNext())
            i.next().playMatch();

        wasPlayed = true;

        return getResult();
    }

    public String getResult() {
        String result = "";

        /*Iterator<Match> i = this.iterator();
        while(i.hasNext())
            result += (i.next().getResult() + "\n");*/

        Set<Match> xdd= this;
        for(Match match : xdd)
            result += (match.getResult() + "\n");

        return result;
    }
}
