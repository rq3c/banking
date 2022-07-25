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
			boolean conf1 = false;
			do 
			{
				if(sN > 5 || sN < 1) 
				{
				System.out.println("Invalid room selection, please input a valid desired room:");
				sN = sc.nextInt();
				conf1 = true;
				}
			}while(conf1 = false);
			conf1 = false;
			System.out.println("Room "+ sN +" selected!");
			//Room selected
			
			System.out.println("Please input desired row:");
			int row = sc.nextInt();
			boolean conf2 = false;
			do 
			{
				if(row > 4  || row < 1);
				{
				System.out.println("Invalid row selection, please input a valid desired row:");
				row = sc.nextInt();
				conf2 = true;
				}
			}while(conf2 = false);
			conf2 = false;
			System.out.println("Row "+ row +" selected!");
			//Row selected
			
			System.out.println("Please input desired column:");
			int column = sc.nextInt();
			boolean conf3 = false;
			do
			{
			if(column > 4  || column < 1);
			{
				System.out.println("Invalid column selection, please input a valid desired column:");
				column = sc.nextInt();
				conf3 = true;
			}
			}while(conf3 = false);
			conf3 = false;
			System.out.println("Column "+ column +" selected!");
			//column selected
			
			
			//check seat
		}
			
		
	}
}