package InvoicingProgect;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainMenuApp {

	public static void main(String[] args) {

		System.out.println(" Welcome to Invoice Store ");
		System.out.println(" ===================================== ");
		Invoice invoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		
		boolean condition = true;
		while(condition==true){
		 int select;
		System.out.println("Press 1 for print Invoice");
        System.out.println("Press 2 for items buy");
        System.out.println("Press 3 for exit");
        
        System.out.println("press any choice number:");
        select = sc.nextInt();

        switch (select) {
        case 1:
		
        	boolean additem = true;
		
        	while (additem) {

			Integer total = 0;

			System.out.println("Enter Invoice Number:  ");
			int invoiceNo = sc.nextInt();
			invoice.setInvoiceNo(invoiceNo);

			System.out.println("Enter Invoice Date:  ");
			String invoiceDate = sc.next();
			invoice.setInvoiceDate(invoiceDate);

			System.out.println("Enter Customer Name:  ");
			String CustomerName = sc.next();
			invoice.setCustomerName(CustomerName);

			System.out.println("Enter Customer Number:  ");
			int CustomerNumber = sc.nextInt();
			invoice.setCustomerNumber(CustomerNumber);
			
		
			System.out.println("Enter Items Number:  ");
			int noOfItems = sc.nextInt();
			invoice.setNoOfItems(noOfItems);

			// enter items

			for (int i = 0; i < noOfItems; i++) {
				System.out.println("Enter the item Name: ");
				String nameOfItem = sc.next();
				System.out.println("Enter the item Price: ");
				double itemPrice = sc.nextDouble();
				System.out.println("Enter the Quantity of the items: ");
				int QuantityOfItems = sc.nextInt();
				System.out.println();

				System.out.println("Do you want to Enter Other items? (yes/no):  ");
				String answer = sc.next();
				invoice.equals(invoice);
				if (answer.equals("yes")) {
					System.out.println("Next item:");
					additem = true;

				} else if (answer.equals("no")) {
					additem = false;

					System.out.println("Total price: ");
					total = (int) (itemPrice * QuantityOfItems);
					System.out.println(total);
					
					//paid amount 
					
					System.out.println("The Paid amount given: ");
					double paidAmount =sc.nextDouble();
					System.out.println("Paid amount is: "+paidAmount);
					Double totalPaid=total-paidAmount;
				
					if (totalPaid<0) {
						System.out.println("shoper return: "+totalPaid+" RO");
					}else if (totalPaid>0) {
						System.out.println("Coustomer must add: "+totalPaid+" RO");
							
					}
					
					break;
				
				}
			}
			
		}
		

        case 2:
        	
        	try{
        	
        	    FileOutputStream fos = new FileOutputStream("Report.txt");
        	    ObjectOutputStream out = new ObjectOutputStream(fos);
        	    System.out.println("Enter items name report: ");
            	invoice.getNameOfItems();
            	System.out.println("Enter items price report: ");
            	invoice.getItemPrice();
            	
        	    out.close();
        	    System.out.println("Report is create sucssesfully");
        	}
        	
        	    catch (IOException ioe){
        	    }
        	
        case 3:
        	 System.exit(0);
        	 
        	 break;

        	
	}
}
}
}