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
    
    public static Fraction multiply(Fraction a, Fraction b){
    int cn = a.numerator * b.numerator;
     int cd = a.denominator * b.denominator;
     int  gcf = GCF(cn,cd);
     System.out.println("Greatest common factor : " + gcf);
     cn = cn/gcf;
     cd = cd/gcf;
		Fraction c = new Fraction(cn,cd);
		return c;
    }
    
    public static Fraction divide(Fraction a, Fraction b){
    int cn = a.numerator * b.denominator;
     int cd = a.denominator * b.numerator;
     int  gcf = GCF(cn,cd);
     System.out.println("Greatest common factor : " + gcf);
     cn = cn/gcf;
     cd = cd/gcf;
		Fraction c = new Fraction(cn,cd);
		return c;
    }
    
        public static Fraction add(Fraction a, Fraction b){
		int can = a.numerator * b.denominator;
		int cbn = b.numerator * a.denominator;
		int cd = a.denominator * b.denominator;
		int cn = can + cbn;
		int  gcf = GCF(cn,cd);
		System.out.println("Greatest common factor : " + gcf);
		cn = cn/gcf;
		cd = cd/gcf;
		Fraction c = new Fraction(cn,cd); 
		return c;
    }
    
            public static Fraction subtract(Fraction a, Fraction b){
		int can = a.numerator * b.denominator;
		int cbn = b.numerator * a.denominator;
		int cd = a.denominator * b.denominator;
		int cn = can - cbn;
		int  gcf = GCF(cn,cd);
		System.out.println("Greatest common factor : " + gcf);
		cn = cn/gcf;
		cd = cd/gcf;
		Fraction c = new Fraction(cn,cd); 
		return c;
    }

    public Fraction(String s) {
        int ind = s.indexOf('/');
        String n = s.substring(0, ind);
        String d = s.substring(ind, s.length());
        int numerator = Integer.parseInt(n);
        int denominator = Integer.parseInt(d);
    }

    // accessor methods
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int toDouble() {
        return  numerator / denominator;
    }
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }

    // mutator method
    
    
    
    public void setNum(int n) {
        numerator = n;
    }
    
    public void reduce(Fraction f) {
        int n = f.numerator;
         int d = f.denominator;
        int gcf = GCF(n,d);
        f.numerator = f.numerator/gcf;
        f.denominator = f.denominator/gcf;
    }
    
    public static int GCF(int a, int b) {
		int y = 0;
        while(y == 0){

			if (a>b){
				a = a-b;

			}else if(b>a){
				b = b-a;
			}else{
				y = 1;
				
			}
		}
		return a;
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
