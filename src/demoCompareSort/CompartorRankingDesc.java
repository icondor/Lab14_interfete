package demoCompareSort;

import java.util.Comparator;

public class CompartorRankingDesc implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o2.getRanking(), o1.getRanking());
    }

}
