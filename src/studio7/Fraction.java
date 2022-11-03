package studio7;

public class Fraction {
	int numerator;
	int denominator;
	public Fraction(int a, int b ) {
		this.numerator = a;
		this.denominator = b;
		
	}
	public void setnum(int a) {
		this.numerator=a;
	}
	public void setdeno(int a) {
		this.denominator=a;
	}
	public int getnum() {
		return numerator;
		
	}
	public int getdeno() {
		return denominator;
		
	}
	public Fraction add(Fraction a) {
		int num1 = a.getnum();
		int deno1 = a.getdeno();
		Fraction b = new Fraction(num1*denominator+numerator*deno1,deno1*denominator);
		return b;
		
	}
	public Fraction multiply(Fraction a) {
		int num1 = a.getnum();
		int deno1 = a.getdeno();
		Fraction b = new Fraction(num1*numerator,deno1*denominator);
		return b;
		
	}
	public Fraction reciprocal() {
		Fraction b = new Fraction(denominator,numerator);
		return b;
	}
	public Fraction simple() {
		int a =gcd(numerator,denominator);
		Fraction b = new Fraction(numerator/a,denominator/a);
		return b;
	}
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
