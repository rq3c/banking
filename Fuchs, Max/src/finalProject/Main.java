package finalProject;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//book 5 random seats
		//add user selected seat choice
		//opt: add system reset
		
		Scanner sc = new Scanner(System.in);
		
		Kino Maxsuksfilms = new Kino();
		for(int i = 0; i <= Maxsuksfilms.Säle.length - 1; i++)
			Maxsuksfilms.addSaal(new Saal(i + 1));
		
		System.out.println("Input 'Book a seat' to begin the reservation");
		if(sc.nextLine().compareTo("Book a seat") == 0)
		{
			System.out.println("Please input desired room:");
			int sN = sc.nextInt();
			while(sN > 5  || sN < 1);
			{
				System.out.println("Invalid room selection, please input a valid desired room:");
				sN = sc.nextInt();
			}			
			System.out.println("Room "+ sN +" selected!");
			
			
			System.out.println("Please input desired row:");
			int row = sc.nextInt();
			while(row > 4  || row < 1);
			{
				System.out.println("Invalid row selection, please input a valid desired row:");
				row = sc.nextInt();
			}			
			System.out.println("Row "+ row +" selected!");
			
			System.out.println("Please input desired column:");
			int column = sc.nextInt();
			while(column > 4  || column < 1);
			{
				System.out.println("Invalid column selection, please input a valid desired column:");
				column = sc.nextInt();
				
			}
			System.out.println("Column "+ column +" selected!");
			
			//check seat
		}
			
		
	}
}