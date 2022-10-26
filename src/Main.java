import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Magic 8 Ball!");
//        System.out.print("Enter a yes-no question and I will answer it: ");
//        String question = scan.nextLine();
//
//        String response = "";  // update this variable with the response
//
//        // Write code here to generate a random number from 1 to 6
//
//        // Write code here to use
//        // appropriate selection statements (if, if else, else)
//        // to choose from 1 of 6 responses and set response to it.
//        // for example, if the number is 1, set response to "Outlook good"
//        // if it’s 2, set response to "Without a doubt!"
//        // etc.
//
//        int numChoice = (int) (Math.random() * 6) + 1;
//        if (numChoice == 1) {
//            response = "YES, 100% YES!";
//        } else if (numChoice == 2) {
//            response = "I'm not sure, try again later.";
//        } else if (numChoice == 3) {
//            response = "Absolutely not.";
//        } else if (numChoice == 4) {
//            response = "Maybe??";
//        } else if (numChoice == 5) {
//            response = "Who knows, I don't know.";
//        } else if (numChoice == 6) {
//            response = "no";
//        }
//        System.out.println(response);  // print response

//        int score = 83;
//        String grade = "";
//
//        if (score < 60) {
//            grade = "F";
//        } else if (score >= 60) {
//            grade = "D";
//        } else if (score >= 70) {
//            grade = "C";
//        } else if (score >= 80) {
//            grade = "B";
//        } else {
//            grade = "A";
//        }
//        System.out.println(grade);

        SelectionMadness madness = new SelectionMadness();

        // test flipcoin -- these will return true or false randomly
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        // test rightTriangle
        System.out.println(madness.rightTriangle(3, 4, 5));
        System.out.println(madness.rightTriangle(5, 4, 3));
        System.out.println(madness.rightTriangle(6, 8, 10));
        System.out.println(madness.rightTriangle(8, 10, 6));
        System.out.println(madness.rightTriangle(3, 6, 5));
        System.out.println(madness.rightTriangle(1, 2, 3));

    }
}
