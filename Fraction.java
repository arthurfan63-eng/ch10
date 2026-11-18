public class Fraction {
    private int numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator cannot be zero");
        }
    }

    public Fraction(String s) {
        int ind = s.indexOf('/');
        String n = s.substring(0, ind);
        String d = s.substring(ind, s.length());
        int numerator = parseInt(n);
        int denominator = parseInt(d);
    }

    // accessor methods
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int toDouble() {
        return (double) numerator / denominator;
    }
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }

    // mutator meth
    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator cannot be zero");
        }
    }
}
