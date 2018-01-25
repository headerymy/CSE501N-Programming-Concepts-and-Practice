package studio7;

public class HockeyPlayer {

	private int numofGames;
	private int goals;
	private int assists;
	private final int jerseyNum;
	private final String name;

	public HockeyPlayer() {
		this.name = "";
		this.numofGames = 0;
		this.goals = 0;
		this.assists = 0;
		this.jerseyNum = 0;
	}
	
	public HockeyPlayer(String name, int jerseyNum, int goals, int assists) {
		this.name = name;
		this.goals = goals;
		this.assists = assists;
		this.jerseyNum = jerseyNum;
	}
	
	public int getJerseyNum() {
		return jerseyNum;
	}
	
	public void setNumofGames() {
		numofGames += 1;
	}
	
	public int getNumofGames() {
		return numofGames;
	}
	
	public int sumGoals(int g) {
		goals += g;
		return goals;
	}

	public int sumAssists(int a) {
		assists += a;
		return assists;
	}

	public String toString() {
		String str = "";
		setNumofGames();
		str += name + "(Number " + getJerseyNum() + ")" + " got " + goals + " goals and " + assists + 
				" assists in this game. The points is " 
				+ (goals + assists) + '\n';
		str += name + "(Number " + getJerseyNum() + ")" + " had " + getNumofGames() + 
				" game(s) until now. The total goals is " + sumGoals(goals) + 
				", total assists is " + sumAssists(assists) + " ans total points is " + (sumGoals(goals) + sumAssists(assists));
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyPlayer p = new HockeyPlayer("aa", 23, 10, 10);
		System.out.println(p.toString());
		HockeyPlayer m = new HockeyPlayer("bb", 24, 20, 20);
		System.out.println(m.toString());
	}

}
