package finalProject;

public class Saal
{
	int sNr;
	boolean[][] seats = new boolean[4][4];
	
	public Saal(int sNr)
	{
		this.sNr = sNr;
	}
	
	public boolean getSeat(int r, int c)
	{
		return seats[r][c];
	}
	
	/**public void bookSeat(int r, int c)
	{
		seats[r][c] = true;
	}**/
	//bookSeats backup
}