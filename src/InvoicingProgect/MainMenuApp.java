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
		
		
//		System.out.println("Enter School id:  ");
//		int sId = sc.nextInt();
//		sch.setSchoolId(sId);
//		+ invoice.getInvoiceNo()
	

	}

}
