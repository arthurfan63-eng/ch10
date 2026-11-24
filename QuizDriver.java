import java.util.Random;
public class QuizDriver {
    public static void main(String[] args) {
		char[] operators = {'*', '/','+','-'};
        Random random = new Random();
       char randomOp = operators[random.nextInt(4)];
       int randomNumber=random.nextInt(9);
        Quiz f1 = new Quiz(randomNumber, randomNumber);
        Quiz f2 = new Quiz(randomNumber,randomNumber);
        System.out.println(f1+" "+randomOp+" "+f2);
        Quiz f3 = Quiz.divide(f1, f2);
        System.out.println(f3);
        System.out.println(f3.toDouble());
        System.out.println(randomOp);
    }
}
