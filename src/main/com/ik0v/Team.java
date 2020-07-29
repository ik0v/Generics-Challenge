package main.com.ik0v;

public abstract class Team implements Comparable<Team>{

    private String name;
    private int score;

    @Override
    public int compareTo(Team o) {
        if(this.score > o.getScore()) return -1;
        if(this.score < o.getScore()) return 1;
        else return 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "main.com.ik0v.Team{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
