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

    // lecture 38 Assignment Operator VS equals to Operator
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        //if using one equals to the sout line, this will still be printed pga it still finds a boolean value
        boolean isCar = false;
        if (isCar == true){
            System.out.println("this is not supposed to happen");
        }

        // the ! or NOT operator is also known as the logical complement operator.
        //for booleans ! tests the alternate value. we saw (isCat) tests for true, by adding a !-operator before the value we can check the opposite - false in this case
        boolean isCat = false;
        if (isCat){
            System.out.println("this is not a cat");
        }

        // lecture 39. Ternary operator
        // Ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition
        //Its a shortcut of the if-then-else statement
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}
