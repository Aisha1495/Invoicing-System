package InvoicingProgect;

import java.util.Scanner;

public class MainMenuApp {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice();
		
		
		System.out.println(" Welcome to Invoice System ");
		System.out.println(" ============================================== ");
		
		Scanner sc = new Scanner(System.in);
		
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
		//inter items
	 
		Integer total = 0;
		for(int i=0; i<noOfItems; i++) {
			System.out.println("Enter the item Name: ");
			String nameOfItem=sc.next();
			System.out.println("Enter the item Price: ");
			int itemPrice = sc.nextInt();
			System.out.println("Enter the Quantity of the items: ");
			int QuantityOfItems = sc.nextInt();
			System.out.println();
			
			total=total+(itemPrice*QuantityOfItems);
			
		}
			
			

	
		}
	}

