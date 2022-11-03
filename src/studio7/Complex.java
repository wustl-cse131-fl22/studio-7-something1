package studio7;

public class Complex {
double r;
double i;
public Complex(double a ,double b) {
	this.r =a;
	this.i =b;
}
public double getr() {
	return r;
	
}
public double geti() {
	return i;
	
}
public Complex add(Complex a) {
	Complex b = new Complex(r+a.getr(),i+a.geti());
	return b;
	
}
public Complex multiply(Complex z) {
	double a = r;
	double b = i;
	double c = z.getr();
	double d = z.geti();
	Complex y = new Complex(a*c-b*d,a*d+b*c);
	return y;
	
}
}
