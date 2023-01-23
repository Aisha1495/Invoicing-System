package InvoicingProgect;

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
	private Integer totalPrice;
	private Integer paymentPrice;
	
	
//git sit 
	
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
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(Integer paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	


	
	
	

	
}
