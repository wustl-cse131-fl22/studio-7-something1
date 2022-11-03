package studio7;

public class Rectangle {
double length;
double width;
public Rectangle(double a, double b) {
	this.length =a;
	this.width = b;
}
public double getlength() {
	return length;
	
}
public double getwidth() {
	return width;
}
public void setlength(double a) {
	this.length = a;
	
	
}
public void setwidth(double a) {
this.width = a;

}
public double area() {
	return length*width;
	
}
public double perimeter() {
	return (length+width)*2;
	
}
public boolean issquare() {
	if(width==length) {
		return true;
	}else {
		return false;
	}
	
}
public boolean issmaller(Rectangle a) {
	if(a.area()<area()) {
		return true;
	}else {
		return false;
	}
	
	
}
}
