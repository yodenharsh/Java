import java.util.Scanner;
import java.util.Date;

public class reservation {
        Scanner s = new Scanner(System.in);
	// Create an array of 12 seats, 6 executive and 6 gold.
	public static int[] seats = new int[12];
        static String movie=" "; static int price=0;
	public static void main() {
		System.out.println("Book a ticket!");
		System.out.println("Which movie do you want to book?");
		System.out.println("1.action star,2.guy in forest,3.we stars");
                Scanner s = new Scanner(System.in);
		int ch=s.nextInt();
		
		if(ch==1)		
		{movie="Action star";price=170;}
		else if(ch==2)
		{movie="Guy in Forest";price=210;}
		else if(ch==3)
		{movie="We Stars";price=140;}
		else
		System.out.println("Enter valid movie number");
		for (int i = 0; i < 12; i++) {
			seats[i] = 0;
		}

		
		
		int choice = 1;//  default the choice to executive.

		
		System.out.print("Please enter 1 for executive, 2 for gold, or 0 to exit: ");
		choice = s.nextInt();


		// 0 is for exiting the program
		while (choice != 0) {
			int seatnumber = 0;


			// If they chose a executive seat, attempt to book it.
			if (choice == 1) {
				seatnumber = bookexecutive();


				
				if (seatnumber == -1) {// No executive seats available, try booking an gold seat for them instead.
					seatnumber = bookgold();
				
					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book a executive seat. But do have an gold seat.");
						printTickets(seatnumber);
					}
				}
				else {
					// Booking a executive seat was successful.
					System.out.println("You are in luck, we have a executive seat available!");
					printTickets(seatnumber);
				}
			}
			else if (choice == 2) {// If they chose booking a gold, check to see if it is available.

				
				seatnumber = bookgold();
			
				// If not available, see if we have executive seats available.
				if (seatnumber == -1) {
					seatnumber = bookexecutive();

					if (seatnumber != -1) {
						System.out.println("Sorry, we were not able to book an gold seat. But do have a executive seat.");
						printTickets(seatnumber);
					}
				}
				else {
					
					System.out.println("You are in luck, we have an gold seat available!");
					printTickets(seatnumber);
				}
			}
			else {
				
				System.out.println("Invalid choice made. Please try again!");
				choice = 0;
			}


			
			if (seatnumber == -1) {// No executive or gold seats available. 
				System.out.println("We are sorry, there are no executive or gold seats available.");
				System.out.println();
			}


			// Reprompt for a choice
			System.out.print("Please enter 1 for executive, 2 for gold, or 0 to exit: ");
			choice = s.nextInt();
		}

			
	}


	//checks for executive seats and returns seat number or -1 if full.
	private static int bookexecutive() {
		for (int i = 0; i < 6; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;
	}


	//checks to see if gold seats were available, -1 if full.
	private static int bookgold() {
		for (int i = 6; i < 12; i++) {
			if (seats[i] == 0) {
				seats[i] = 1;
				return i + 1;
			}
		}
		return -1;

	}
	public static void printTickets(int seatnumber) {
		Date timenow = new Date();
		System.out.println();
		System.out.println("Booked a ticket for "+ movie);
		System.out.println("Price for the ticket is "+price);
		System.out.println("Date: " + timenow.toString());
		System.out.println("Seat number: " + seatnumber);
		System.out.println("This ticket is non-refundable and non-transferable.");
		System.out.println("Please be curteous, do not smoke. Enjoy your movie.");
		System.out.println();
	}
}