package demoCompareSort;

import java.util.Comparator;

public class CompartorRankingAsc implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Integer.compare(o1.getRanking(), o2.getRanking());
    }

}
