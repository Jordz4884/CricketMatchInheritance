package greg.sport.cricket;

import greg.sport.Player;

public class Cricketer extends Player {
    private int highestScore;
    private int totalRuns;
    private int noOfInnings;
    private int currentScore;

    public Cricketer(String name, String surname, int highestScore, int totalRuns, int noOfInnings) {
        super(name, surname);
        this.highestScore = highestScore;
        this.totalRuns = totalRuns;
        this.noOfInnings = noOfInnings;
    }

    public Cricketer(String name, String surname){
        super(name, surname);
        new Cricketer("0", "0", 0, 0, 0);
    }

    public void bat(){
        currentScore = (int) ((highestScore + 50) * Math.random());
        System.out.println(getName() + " " + getSurname() + " scored " + currentScore);
        if(currentScore > highestScore){
            currentScore = highestScore;
        }
        totalRuns += currentScore;
        noOfInnings++;
    }

    public int getCurrentScore(){
        return currentScore;
    }

    public void printDetails(){
        System.out.println(getName() + " " + getSurname() + " scored " + getCurrentScore() + " today.");
        int ave = totalRuns / noOfInnings;
        System.out.println("Batting average is now " + ave);
    }

    @Override
    public void play(){
        bat();
    }
}
