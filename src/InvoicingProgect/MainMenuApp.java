package InvoicingProgect;

import java.util.Scanner;

public class MainMenuApp {

	public static void main(String[] args) {

		Invoice invoice = new Invoice();

		System.out.println(" Welcome to Invoice System ");
		System.out.println(" ============================================== ");

		Scanner sc = new Scanner(System.in);

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

			// inter items

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
					
					break;

				}
				
			}
		}

	}
}
