package finalProject;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//book 5 random seats
		
		Scanner sc = new Scanner(System.in);
		
		Kino Maxsuksfilms = new Kino();
		//created Object Kino
		
		for(int i = 0; i <= Maxsuksfilms.Säle.length - 1; i++)
			Maxsuksfilms.addSaal(new Saal(i + 1));
		//created Objects "Saal"
		
		System.out.println("Input 'Book a seat' to begin the reservation");
		if(sc.nextLine().compareTo("Book a seat") == 0)
		//confirmation
			
		{
			System.out.println("Please input desired room:");
			int sN = sc.nextInt();
			while(sN > 5 || sN < 1)
			{
				System.out.println("Invalid room selection, please input a valid desired room:");
				sN = sc.nextInt();
			}
			System.out.println("Room "+ sN +" selected!");
			//Room selected
			
			System.out.println("Please input desired row:");
			int row = sc.nextInt();
			while(row > 4 || row < 1)
			{
				System.out.println("Invalid row selection, please input a valid desired row:");
				row = sc.nextInt();
			}
			System.out.println("Row "+ row +" selected!");
			//Row selected
			
			System.out.println("Please input desired column:");
			int column = sc.nextInt();
			while(column > 4 || column < 1)
			{
				System.out.println("Invalid column selection, please input a valid desired column:");
				column = sc.nextInt();
			}
			System.out.println("Column "+ column +" selected!");
			//column selected
			
			Maxsuksfilms.bookSeat(sN, row, column);
			//check seat
		}
		else if(sc.nextLine().compareTo("reset") == 0)
		{
			Maxsuksfilms = new Kino();
			for(int i = 0; i <= Maxsuksfilms.Säle.length - 1; i++)
				Maxsuksfilms.addSaal(new Saal(i + 1));
			System.out.println("System successfully reset");
			
		}
	sc.close();
	}
}