public class FractionDriver{

	public static void main(String[] args){
	Fraction f1 = new Fraction(10,1);
	Fraction f2 = new Fraction(0,10);	
	Fraction f3 = Fraction.add(f1,f2);	
	System.out.println(f3);

}
}
