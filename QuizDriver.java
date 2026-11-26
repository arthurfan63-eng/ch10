import java.util.Random;
import java.util.Scanner;

public class QuizDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] operators = {'*', '/', '+', '-'};
        boolean active = true;
        System.out.println(
            "Let the fraction Fraction begin. Each answer should be in lowest term. Good luck");
        int correctans = 0;
        int totans = 0;
        while (active == true) {
            Random random = new Random();
            char randomOp = operators[random.nextInt(4)];
            int randomNumber1 = random.nextInt(9) + 1;
            int randomNumber2 = random.nextInt(9) + 1;
            int randomNumber3 = random.nextInt(9) + 1;
            int randomNumber4 = random.nextInt(9) + 1;

            Fraction f1 = new Fraction(randomNumber1, randomNumber2);
            Fraction f2 = new Fraction(randomNumber3, randomNumber4);

            if ((double) randomNumber1 / randomNumber2 < (double) randomNumber3 / randomNumber4) {
                f1 = f2;
                f2 = new Fraction(randomNumber1, randomNumber2);
            }
            if ((double) randomNumber1 / randomNumber2 == (double) randomNumber3 / randomNumber4) {
                if (randomNumber1 != 9 && randomNumber1 != 1) {
                    f1 = new Fraction(randomNumber1 + 1, randomNumber2);

                } else if (randomNumber1 == 1) {
                    f1 = new Fraction(randomNumber1 + 2, randomNumber2);
                } else {
                    f1 = new Fraction(randomNumber1 - 1, randomNumber2);
                }
            }

            System.out.print(f1 + " " + randomOp + " " + f2 + "= ");

            if (randomOp == '*') {
                String ans = scanner.next();
                Fraction f3 = Fraction.multiply(f1, f2);
                String f4 = f3.toString();
                if (ans.equals(f4)) {
                    System.out.println("Correct!");
                    correctans = correctans + 1;
                    totans++;
                }
                if (!ans.equals(f4) && !ans.equals("quit")) {
                    System.out.println("Wrong, the answer was " + f4);
                    totans++;
                }
                if (!ans.equals(f4) && ans.equals("quit")) {
                    active = false;
                    double percent = ((double) correctans / totans);
                    if (totans == 0)percent = 0.0;
                    System.out.println("You answered " + correctans + " correctly, out of " + (totans- correctans) + " for a score of " + percent + " percent");
                       
                }
            }
            if (randomOp == '/') {
                String ans = scanner.next();
                Fraction f3 = Fraction.divide(f1, f2);
                String f4 = f3.toString();
                if (ans.equals(f4)) {
                    System.out.println("Correct!");
                    correctans = correctans + 1;
                    totans++;
                }
                if (!ans.equals(f4) && !ans.equals("quit")) {
                    System.out.println("Wrong, the answer was " + f4);
                    totans++;
                }
                if (!ans.equals(f4) && ans.equals("quit")) {
                    active = false;
                    double percent = ((double) correctans / totans);
                    if (totans == 0)percent = 0.0;
                    System.out.println("You answered " + correctans + " correctly, out of " + (totans- correctans) + " for a score of " + percent + " percent");
                       
                }
            }
            if (randomOp == '+') {
                String ans = scanner.next();
                Fraction f3 = Fraction.add(f1, f2);
                String f4 = f3.toString();
                if (ans.equals(f4)) {
                    System.out.println("Correct!");
                    correctans = correctans + 1;
                    totans++;
                }
                if (!ans.equals(f4) && !ans.equals("quit")) {
                    System.out.println("Wrong, the answer was " + f4);
                    totans++;
                }
                if (!ans.equals(f4) && ans.equals("quit")) {
                    active = false;
                    double percent = ((double) correctans / totans);
                    if (totans == 0)percent = 0.0;
                    System.out.println("You answered " + correctans + " correctly, out of " + (totans- correctans) + " for a score of " + percent + " percent");
                        
                }
            }
            if (randomOp == '-') {
                String ans = scanner.next();
                Fraction f3 = Fraction.subtract(f1, f2);
                String f4 = f3.toString();
                if (ans.equals(f4)) {
                    System.out.println("Correct!");
                    correctans = correctans + 1;
                    totans++;
                }
                if (!ans.equals(f4) && !ans.equals("quit")) {
                    System.out.println("Wrong, the answer was " + f4);
                    totans++;
                }
                if (!ans.equals(f4) && ans.equals("quit")) {
                    active = false;
                    double percent = ((double) correctans / totans);
                    if (totans == 0)percent = 0.0;
                    System.out.println("You answered " + correctans + " correctly, out of " + (totans- correctans) + " for a score of " + percent + " percent");
                       
                }
            }
        }
    }
}
