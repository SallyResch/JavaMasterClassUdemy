package udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    /*if (score < 5000 && score >1000) {
        System.out.println("your score was less then 5000");
    }else if(score <1000){
        System.out.println("your score was less the 1000");
    }else{
        System.out.println("Got to 5000");
    }*/

    if (gameOver){
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("your final score was " + finalScore);
    }
    /*int newScore = 10000;
    int newLevelCompleted = 8;
    int newBonus = 200;

    if(gameOver == true){
        int newFinalScore = newScore + (newLevelCompleted * newBonus);
        System.out.println("Your new final score was " + newFinalScore);

     }*/
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}
