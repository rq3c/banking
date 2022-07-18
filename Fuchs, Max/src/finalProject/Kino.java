package finalProject;

public class Kino
{
	Saal[] Säle;
	
	public void bookSeat(int sNr, int row, int column)
	{
		if(Säle[sNr-1].getSeat(row, column) == false)
		{
			Säle[sNr-1].seats[row][column] = true;
			System.out.println("Seat " + row + ", " + column + " successfully booked");
		}
			
		else
			System.out.println("Seat already booked, please pick a new seat");
		//add main method error catching
	}
}