import java.util.Random;
import java.util.Scanner;

public class QuizDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] operators = {'*', '/', '+', '-'};
        Random random = new Random();
        char randomOp = operators[random.nextInt(4)];
        int randomNumber1 = random.nextInt(9) + 1;
        int randomNumber2 = random.nextInt(9) + 1;
        int randomNumber3 = random.nextInt(9) + 1;
        int randomNumber4 = random.nextInt(9) + 1;
        int correctans = 0;
        int totans = 0;
        Quiz f1 = new Quiz(randomNumber1, randomNumber2);
        Quiz f2 = new Quiz(randomNumber3, randomNumber4);
        System.out.println(
            "Let the fraction Quiz begin. Each answer should be in lowest term. Good luck");
        System.out.print(f1 + " " + randomOp + " " + f2 + "= ");

        if (randomOp == '*') {
            String ans = scanner.next();
            Quiz f3 = Quiz.mult(f1, f2);
            String f4 = f3.toString();
            if (ans.equals(f4)) {
                System.out.println("Correct!");
                correctans = correctans + 1;
                totans = totans + 1;
            }
            if (!ans.equals(f4) && !ans.equals("quit")) {
                System.out.println("Wrong, the answer was " + f4);
                totans = totans + 1;
            }
            if (!ans.equals(f4) && ans.equals("quit")) {
                System.out.println("You answered x correctly, for a score of y percent");
            }
        }
        if (randomOp == '/') {
            String ans = scanner.next();
            Quiz f3 = Quiz.divide(f1, f2);
            String f4 = f3.toString();
            if (ans.equals(f4)) {
                System.out.println("Correct!");
                correctans = correctans + 1;
                totans = totans + 1;
            }
            if (!ans.equals(f4) && !ans.equals("quit")) {
                System.out.println("Wrong, the answer was " + f4);
                totans = totans + 1;
            }
            if (!ans.equals(f4) && ans.equals("quit")) {
                System.out.println("You answered x correctly, for a score of y percent");
       
            }
        }
        if (randomOp == '+') {
            String ans = scanner.next();
            Quiz f3 = Quiz.add(f1, f2);
            String f4 = f3.toString();
            if (ans.equals(f4)) {
                System.out.println("Correct!");
                correctans = correctans + 1;
                totans = totans + 1;
            }
            if (!ans.equals(f4) && !ans.equals("quit")) {
                System.out.println("Wrong, the answer was " + f4);
 totans = totans + 1;
            }
            if (!ans.equals(f4) && ans.equals("quit")) {
                System.out.println("You answered x correctly, for a score of y percent");
                
            }
        }
        if (randomOp == '-') {
            String ans = scanner.next();
            Quiz f3 = Quiz.subtract(f1, f2);
            String f4 = f3.toString();
            if (ans.equals(f4)) {
                System.out.println("Correct!");
                correctans = correctans + 1;
                totans = totans + 1;
            }
            if (!ans.equals(f4) && !ans.equals("quit")) {
                System.out.println("Wrong, the answer was " + f4);
                totans = totans + 1;
            }
            if (!ans.equals(f4) && ans.equals("quit")) {
                System.out.println("You answered x correctly, for a score of y percent");
                
            }
        }
    }
}
