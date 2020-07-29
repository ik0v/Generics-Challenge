package main.com.ik0v;

public class Main {
    public static void main(String[] args) {

        LeagueTable<GoldTeam> gold = new LeagueTable<>();
        LeagueTable<SilverTeam> silver = new LeagueTable<>();

        GoldTeam gold1 = new GoldTeam("Gold1", 2);
        GoldTeam gold2 = new GoldTeam("Gold2", 7);
        GoldTeam gold3 = new GoldTeam("Gold2", 5);

        SilverTeam silver1 = new SilverTeam("Silver1", 3);
        SilverTeam silver2 = new SilverTeam("Silver2", 6);

        gold.addTeam(gold1);
        gold.addTeam(gold2);
        gold.addTeam(gold3);
//       gold.addTeam(silver1); - Error:(17, 21) java: incompatible types: main.com.ik0v.SilverTeam cannot be converted to main.com.ik0v.GoldTeam

        silver.addTeam(silver1);
        silver.addTeam(silver2);

        gold.sortTeams();
        silver.sortTeams();

        gold.printTeams();
        silver.printTeams();

    }
}
