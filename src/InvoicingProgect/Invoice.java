package InvoicingProgect;

import java.util.ArrayList;

public class Invoice {
	//data of invoice
	private Integer invoiceNo;
	private String invoiceDate;
	//data of customer in invoice
	private String CustomerName;
	private Integer CustomerNumber;
	//data of items in invoice with price
	private Integer noOfItems;
	private String nameOfItems;
	private double itemPrice;
	private Integer QuantityOfItems;
	private double paidAmount;
	private double paymentPrice;
	
	ArrayList<String> itemsList = new ArrayList<>();

	//git/set 
	
	public Integer getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Integer getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		CustomerNumber = customerNumber;
	}
	public Integer getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}
	public String getNameOfItems() {
		return nameOfItems;
	}
	public void setNameOfItems(String nameOfItems) {
		this.nameOfItems = nameOfItems;
	}
	
	public double getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(double paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getQuantityOfItems() {
		return QuantityOfItems;
	}
	public void setQuantityOfItems(Integer quantityOfItems) {
		QuantityOfItems = quantityOfItems;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	


	
	
	

	
}
