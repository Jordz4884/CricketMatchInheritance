package greg.sport.cricket;

import java.util.Random;

public class Bowler extends Cricketer {
    private int totalWickets;
    private int currentWickets;

    public Bowler(String name, String surname, int highestScore, int totalRuns, int noOfInnings, int totalWickets){
        super(name, surname, highestScore, totalRuns, noOfInnings);
        this.totalWickets = totalWickets;
    }

    public Bowler(String name, String surname){
        super(name, surname);
        new Bowler("0", "0 ", 0, 0, 0, 0);
    }

    public void bowl(){
        Random random = new Random();
        currentWickets = random.nextInt(0, 3);
        System.out.println(getName() + " " + getSurname() + " took " + currentWickets + " wicket(s).");
        totalWickets += currentWickets;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Wickets taken today : " + currentWickets + ". Total wickets is now : " + totalWickets);
    }

    @Override
    public void play(){
        bat();
        bowl();
    }
}
