package greg.sport.cricket;

import java.util.Random;

public class Keeper extends Cricketer {
    private int totalCatches;
    private int currentCatches;

    public Keeper(String name, String surname, int highestScore, int totalRuns, int noOfInnings, int totalCatches){
        super(name, surname, highestScore, totalRuns, noOfInnings);
        this.totalCatches = totalCatches;
    }

    public Keeper(String name, String surname){
        super(name, surname);
        new Keeper("0", "0", 0, 0, 0, 0);
    }

    public void keepWicket(){
        Random random = new Random();
        currentCatches = random.nextInt(0, 11);
        System.out.println(getName() + " " + getSurname() + " took " + currentCatches + " catch(es) behind the stumps.");
        totalCatches += currentCatches;
    }

    @Override
    public void printDetails(){
        super.printDetails();;
        System.out.println("And took : " + currentCatches + " today. Total catches is now : " + totalCatches);
    }

    @Override
    public void play(){
        bat();
        keepWicket();
    }
}
