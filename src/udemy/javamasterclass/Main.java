package udemy.javamasterclass;

public class Main {

    public static void main(String[] args) {
	// Keywords and expressions: https://en.wikipedia.org/wiki/List_of_Java_keywords
        //Det som är orange är keywords

        //en mil är likamed 1.609344 kilometer
        double kilometers = (100*1.609344);
        //Expressions är variables, values and operators

        int highScore=50;

        if(highScore==50){
            System.out.println("this is an expression");
        }
    //45.Statements, whitespaces and indentation (code organization)
        int myVariable=50;
        if (myVariable==50){
            System.out.println("Printed");
        }
        myVariable++;
        myVariable--;
        System.out.println("this is a test");

        System.out.println("this is" +
                "another" +
                "still more.");
        int anotherVariable = 50;
        myVariable--;

    //46. Code blocks and the if then else control statements
        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;
        if(score < 5000 && score > 1000){
            //codeblock
            System.out.println("your score was less than 5000 but greater than 1000");
            System.out.println("and you´re awesome, truly");
        }
        else if(score < 1000){
            System.out.println("your score was less than 1000");
            System.out.println("and you´re still awesome, truly");
        }
        else{
            System.out.println("You got the highest score ever seen, wth broh!!");
        }
    }
}
