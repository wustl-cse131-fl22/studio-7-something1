package studio7;

public class HockeyPlayer {
	String Name;
	String JNum;
	String Hand;
	String Shoot;
	int Games;
	int goals;
	int assists;
    int points;
    public HockeyPlayer(String n,String j, String h, String s) {
    	this.Name = n;
    	this.JNum = j;
    	this.Hand=h;
    	this.Shoot=s;
    }
    public void calculatescore(int g, int a) {
    	this.Games++;
    	this.goals = goals+g;
    	this.assists = assists+a;
    	this.points = points+ g+a;
    	
    }
}
