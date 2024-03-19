package demoCompareSort;

public class TennisPlayer implements Comparable<TennisPlayer>{
    private String name;
    private int ranking;

    private boolean isActive;


    static boolean sort;

    public TennisPlayer(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }


    public int compareTo(TennisPlayer o) {
        if(sort)
        return Integer.compare(this.ranking, o.ranking);
        else
            return Integer.compare( o.ranking, this.ranking);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
