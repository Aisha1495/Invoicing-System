package InvoicingProgect;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		        	itemsMenu();
		        	break;
		        case 3:
		        	// Create New Invoice
		        	addNewInvoice();
		        case 4:
		        	//Report: Statistics
		        	statistics(); //** 
		        case 5:
		        	//All Invoices
		        	printAllInvoices(); //**
		        case 6:
		        	//search Invoice
		        	searchInvoice(); //**
		        case 7:
		        	//Program Statistics
		        	programStatistics(); //** 
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
	        if(select == 1) {
	        	//load settings from file
	        	loadSettings();
	        	//load items from file
	        	loadItems();
	        	//load invoices from file
	        	loadInvoices();
	        	System.out.println("Data Loaded Seccssfully");
	        	
	        }else if(select == 2) {
	        	System.out.println("Enter Shop Name:");
				String shopName = sc.next();
				MainMenuApp.settings.setShopName(shopName);
				System.out.println("New Shop Name Saved");
				saveSettings();

	        	
	        }else if(select == 3) {
	        	System.out.println("Enter phone Number:");
				int TelNum = sc.nextInt();
				MainMenuApp.settings.setTelNum(TelNum);
				
				System.out.println("Enter Fax:");
				int faxNo = sc.nextInt();
				MainMenuApp.settings.setFaxNo(faxNo);
				
				System.out.println("Enter Email  Address:");
				String Email = sc.next();
				MainMenuApp.settings.setEmail(Email);
				
				System.out.println("Enter website:");
				String Website = sc.next();
				MainMenuApp.settings.setWebsite(Website);
				
				saveSettings();
				System.out.println("New Shop Data Saved");

				
	        }else if(select == 4) {
	        	main(null);
	        }
	        
	        // repete menu if get here
			printMenu(2);
			settingsMenu();
	          
		}
		
		//options for item menu
		private static void itemsMenu() {
	        Scanner sc = new Scanner(System.in);
	        int select = sc.nextInt();
	        
	        // add new item
	        if(select == 1) {
	        	
	        	//ask user to enter item data
	        	Items newitem = new Items();
	        	
	        	System.out.println("Enter item ID: ");
	        	int idOfItem = sc.nextInt();
				newitem.setItemId(idOfItem);
				
	        	System.out.println("Enter item Name: ");
				String nameOfItem = sc.next();
				newitem.setItemName(nameOfItem);
				
				System.out.println("Enter item Price: ");
				double itemPrice = sc.nextDouble();
				newitem.setitemPrice(itemPrice);
				
				System.out.println("Enter the Stock: ");
				int stockOfItems = sc.nextInt();
				newitem.setStock(stockOfItems);
				
				//add new item to the global items array
				MainMenuApp.items.add(newitem);
				saveItems();
				System.out.println("New Item Saved");
				
				//delete item
	        }else if(select == 2) {
	        	
	        	boolean found = false;
	        
	        	System.out.println("Enter item ID: ");
	        	int idOfItem = sc.nextInt();
	        	
	        	for(int i =0; i < MainMenuApp.items.size(); i++) {
	        		if(MainMenuApp.items.get(i).getItemId() == idOfItem) {
	        			MainMenuApp.items.remove(i);
	        			found = true;
	        		}
	        	}
	        	
	        	if(found) {
		        	saveItems();
					System.out.println("Item Deleted");
	        	}else {
	        		System.out.println("Item not Found");
	        	}

	        	//change item price
	        }else if(select == 3) {
	        	
	        	System.out.println("Enter item ID: ");
	        	int idOfItem = sc.nextInt();
	        	
	        	for(int i =0; i < MainMenuApp.items.size(); i++) {
	        		if(MainMenuApp.items.get(i).getItemId() == idOfItem) {
	        			
	        			System.out.println("Item Found Enter New Price: ");
	        			double priceOfItem = sc.nextDouble();
	        			
	        			MainMenuApp.items.get(i).setitemPrice(priceOfItem);
	        			System.out.println("New Item Price Saved");
	        			saveItems();
	        		}
	        	}
	        	
	        	//print all items
	        }else if(select == 4) {
	        	System.out.println("-------------------");
	        	
	        	for(Items item : MainMenuApp.items) {
	        		System.out.format("ID:%d Name%s Price:%f Stock:%d \r\n",item.getItemId(), item.getItemName(), item.getitemPrice(), item.getStock());
	        	}

	        	System.out.println("-------------------");
	        }else if(select == 5) {
	        	main(null);
	        }
	        
			printMenu(3);
			itemsMenu();
		}
		
		//save settings to file
		private static void saveSettings() {
			FileOutputStream fileOutputStream;

			try {
				
				fileOutputStream = new FileOutputStream("C:\\Users\\96893\\eclipse-workspace\\test\\src\\testtesttt\\settings.txt");
			    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			    
			    objectOutputStream.writeObject(MainMenuApp.settings);
			    objectOutputStream.flush();
			    objectOutputStream.close();
		    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		}
		
		//load settings from file
		private static void loadSettings() {

			try {
				FileInputStream fileInputStream = new FileInputStream("C:\\Users\\96893\\eclipse-workspace\\test\\src\\testtesttt\\settings.txt");
				
			    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    
			    //cast object to type setting
			    MainMenuApp.settings = (setting) objectInputStream.readObject();

			    objectInputStream.close();
			 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//save items to file
		private static void saveItems() {
			FileOutputStream fileOutputStream;

			try {
				
				fileOutputStream = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\InvoicingSystem\\items.txt");
			    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			    
			    objectOutputStream.writeObject(MainMenuApp.items);
			    objectOutputStream.flush();
			    objectOutputStream.close();
		    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		}
		
		//load items from file
		private static void loadItems() {

			try {
				FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\InvoicingSystem\\items.txt");
				
			    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    
			    MainMenuApp.items = (ArrayList<Items>) objectInputStream.readObject();

			    objectInputStream.close();
			 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//save invoices to file
		private static void saveInvoices() {
			FileOutputStream fileOutputStream;

			try {
				
				fileOutputStream = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\InvoicingSystem\\invoices.txt");
			    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			    
			    objectOutputStream.writeObject(MainMenuApp.invoices );
			    objectOutputStream.flush();
			    objectOutputStream.close();
		    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		}
		
		//load invoices from file
		private static void loadInvoices() {

			try {
				FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\InvoicingSystem\\invoices.txt");
				
			    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		    
			    MainMenuApp.invoices = (ArrayList<Invoice>) objectInputStream.readObject();

			    objectInputStream.close();
			 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// add new invoice
		private static void addNewInvoice() {
			
	        Scanner sc = new Scanner(System.in);
	    	Invoice newInvoice = new Invoice();
	    	
	    	//get current date in string format
	    	Date date = new Date();  
	    	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    	newInvoice.setInvoiceDate( formatter.format(date));
	    	
	    	//if no invoices size = 0 then this it the first invoice so id should be 1
	    	int newInvoiceId = 1;

	    	//if there is an invoice get last one number and add 1 to it
	    	if(MainMenuApp.invoices.size() != 0) {
	    		newInvoiceId = (MainMenuApp.invoices.get(MainMenuApp.invoices.size() - 1).getInvoiceNo()) + 1;
	    	}
	    	newInvoice.setInvoiceNo(newInvoiceId);
	    	
	    	
	    	System.out.println("Enter Customer Name: ");
	    	String customerName = sc.next();
	    	newInvoice.setCustomerName(customerName);
	    	
	    	System.out.println("Enter Customer Phone: ");
	    	int customerphone = sc.nextInt();
	    	newInvoice.setCustomerNumber(customerphone);
	    	

	    	//start loop to select items
	    	boolean checkout = false;
	    	
	    	ArrayList<Items> newInvoiceItems = newInvoice.getItemsList();
	    	
	    	while (!checkout) {
	    		System.out.println("Select Item: ");
	    		
	    		for(Items item : MainMenuApp.items) {
	    			System.out.format("ID:%d Name:%s\r\n",item.getItemId(), item.getItemName());
	    		}
	    		int itemId = sc.nextInt();
	    		
	    		System.out.println("Enter Quantity: ");
	    		int itemQuantity = sc.nextInt();
	    		
	    		//search for the item and add it to invoice items + set quantity
	    		for(int i=0 ; i < MainMenuApp.items.size(); i++) {
	    			if(MainMenuApp.items.get(i).getItemId() == itemId) {
	    				Items newItem = MainMenuApp.items.get(i);
	    				newItem.setQuantity(itemQuantity);
	    				newInvoiceItems.add(MainMenuApp.items.get(i));
	    			}
	    		}
	        	
	    		System.out.println("Do you weant to Add Another Item?");
	    		int next = sc.nextInt();
	    		
	    		if(next == 0) {
	    			checkout = true;
	    		}
	    		
	    	}
	    	
	    	//calculate total price and items 
	    	double totalAmount = 0;
	    	int noOfItems = 0;
	    	
	    	for(int i=0 ; i < newInvoiceItems.size(); i++) {
	    		//price = item price * quantity
	    		totalAmount += ( newInvoiceItems.get(i).getitemPrice() * newInvoiceItems.get(i).getQuantity());
	    		noOfItems += 1;
			}
	    	
	    	// save items to the invoice
			newInvoice.setItemsList(newInvoiceItems);
			

			//save total price and quantity to invoice
			newInvoice.setNoOfItems(noOfItems);
	    	newInvoice.setTotalAmount(totalAmount);
	    	
	    	System.out.format("Total Amount:%f\r\n",newInvoice.getTotalAmount());
	    	
			System.out.println("How much did the customer pay?");
			double paid = sc.nextDouble();
			
			newInvoice.setPaidAmount(paid);
			
			double remaining = paid - newInvoice.getTotalAmount();
			newInvoice.setPaymentPrice(remaining);
			
			System.out.format("you should return:%f to the customer\r\n",remaining);
			
			//add new invoice to the list
			MainMenuApp.invoices.add(newInvoice);
			//save to file
			saveInvoices();
			
			System.out.print("Invoice Saved Successfully");
			//return to main menu
			main(null);
		}

		//Report: Statistics
		private static void statistics() {
			
			
			main(null);
		}

		//All Invoices
		private static void printAllInvoices() {
			
			
			main(null);
		}

		//search Invoice
		private static void searchInvoice() {
		
			
			main(null);
		}

		//Program Statistics
		private static void programStatistics() {
		
			
			main(null);
		}
		
	}

