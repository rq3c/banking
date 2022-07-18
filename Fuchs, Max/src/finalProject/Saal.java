package finalProject;

public class Saal
{
	int sNr;
	boolean[][] seats;
	
	public Saal(int sNr, boolean[][] chart)
	{
		this.sNr = sNr;
		seats = chart;
	}
	
	public boolean getSeat(int r, int c)
	{
		return seats[r][c];
	}
}