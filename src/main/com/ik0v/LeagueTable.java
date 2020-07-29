package main.com.ik0v;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>  {

    private ArrayList<T> league = new ArrayList<>();

    public boolean addTeam(T newTeam) {
        league.add(newTeam);
        return true;
    }

    public void sortTeams(){
        Collections.sort(league);
    }

    public void printTeams() {
        for(Team i: league) {
            System.out.println(i);
        }
    }


}
