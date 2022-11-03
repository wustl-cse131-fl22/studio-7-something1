package studio7;

public class Die {
	
	int n;
	public Die(int a) {
		this.n=a;
	}
public void setN(int a) {
	this.n=a;
}
public int Roll() {
	
	int a = (int) Math.round(Math.random()*n+1);
	return a;
}

}

