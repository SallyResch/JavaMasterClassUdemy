package udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }

        if(topScore != 100){
            System.out.println("Its not the highest score, sry try again!");
        }

        if(topScore > 100){
            System.out.println("Its greater then the high score");
        }

        if(topScore >= 100){
            System.out.println("Its greater then or equal to the high score");
        }

        if(topScore < 100){
            System.out.println("Its lower then the high score, try again");
        }

        if(topScore <= 100){
            System.out.println("Its lower then or equal to the high score, try to beat it");
        }
    }
}
