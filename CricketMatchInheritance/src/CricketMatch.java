import greg.sport.cricket.Bowler;
import greg.sport.cricket.Cricketer;
import greg.sport.cricket.Keeper;

public class CricketMatch {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Dave", "Matthews", 151, 2073, 41);
        Cricketer c2 = new Cricketer("Jon", "Bon Jovi", 87, 3896, 60);
        Cricketer c3 = new Cricketer("Ben", "Affleck", 121, 3211, 52);
        Cricketer c4 = new Cricketer("Matt", "Damon");
        Cricketer c5 = new Cricketer("Ronan", "Keating");

        Keeper k1 = new Keeper("Steven", "Soderbergh");

        Bowler b1 = new Bowler("Matthew", "Perry", 50, 352, 12, 24);
        Bowler b2 = new Bowler("Larry", "Wachowski", 41, 191, 12, 29);
        Bowler b3 = new Bowler("Brad", "Pitt", 33, 250, 20, 44);
        Bowler b4 = new Bowler("Harrison", "Ford", 25, 87, 8, 19);
        Bowler b5 = new Bowler("Steven", "Segal");

        Cricketer[] team = new Cricketer[]{c1, c2, c3, c4, c5, k1, b1, b2, b3, b4, b5};

        System.out.println("Playing a match : ");

        for(int i = 0; i <= team.length -1; i++){
            team[i].play();
        }

        System.out.println("Summary : ");

        for (int i = 0; i <= team.length -1; i++){
            team[i].printDetails();
        }
    }
}
