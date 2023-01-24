package InvoicingProgect;
import java.util.ArrayList;
import java.util.Scanner;


public class MainMenuApp {
	
	// create array of invoices to store all invices in the system
		public static ArrayList<Invoice> invoices = new ArrayList<Invoice>();
		
		// create array of items to store all items in the system
		public static ArrayList<Items> items = new ArrayList<Items>();
		
		public static setting settings = new setting();
		

	public static void main(String[] args) {
		
		printMenu(1);
        System.out.println("Enter Your option:");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        
        switch (select) {
	        case 1:
	        	//Shop Settings print
	        	printMenu(2);
	        	settingsMenu();
	        	break;
	        case 2:
	        	//Shop Items
	        	printMenu(3);
	        
	        	break;
	        case 3:
	        	// Create New Invoice
	        
	        case 4:
	        	//Report: Statistics
	        	
	        case 5:
	        	//All Invoices
	        
	        case 6:
	        	//search Invoice
	        	
	        case 7:
	        	//Program Statistics
	        	
	        case 8:
	        	//exit
	        	 System.exit(0);
	        	 break;
        }		
}
	
		//the program will call this function if want to print menus (main, settings and items)
	private static void printMenu(int menuNum) {
	        switch (menuNum) {
	        case 1: // main menu
				System.out.println(" Welcome to Invoice Store ");
				System.out.println(" ===================================== ");
				System.out.println("1 Shop Settings");
		        System.out.println("2 Manage items");
		        System.out.println("3 Create New Invoice");
		        System.out.println("4 Statistics");
		        System.out.println("5 All Invoices");
		        System.out.println("6 Search Invoice");
		        System.out.println("7 Program Statistics");
		        System.out.println("8 Exit");
		        break;
	        case 2: // setting menu
				System.out.println("1 Load Data (Items and invoices)");
		        System.out.println("2 Set Shop Name");
		        System.out.println("3 Set Invoice Header (Tel/Fax/Email/Website)");
		        System.out.println("4 Go Back");
		        break;
	        case 3: // items menu
				System.out.println("1 Add Items");
		        System.out.println("2 Delete Items");
		        System.out.println("3 Change Item Price");
		        System.out.println("4 Report All Items");
		        System.out.println("5 Go Back");
		        break;
	        }
		}
		
		//options for settings menu
		private static void settingsMenu() {
	        Scanner sc = new Scanner(System.in);
	        int select = sc.nextInt();
	        
	        // Load Data

		}
			


	}
	
