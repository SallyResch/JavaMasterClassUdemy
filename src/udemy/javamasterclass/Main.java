package udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int topScore = 90;
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
    //both && and || operates on boolean Operands - checking of a given condition is true or false.
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
    }
}
