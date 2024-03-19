package demoCompareSort;

import java.util.Comparator;

public class CompartorActiveAsc implements Comparator<TennisPlayer> {

    @Override
    public int compare(TennisPlayer o1, TennisPlayer o2) {
        return Boolean.compare(o2.isActive(), o1.isActive());
    }

}
