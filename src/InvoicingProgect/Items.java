package InvoicingProgect;

public class Items {

	private String itemName;
	private Integer itemId;
	private Integer itemNo;
	private Integer itemprice;
	private Integer totalPrice=itemprice+itemNo;
	
	
	//
	public void UnitPrice() {
		System.out.println("Item name: "+itemName+ " The price: "+itemprice);
		
	}
	public void quantityTotal() {
		System.out.println("Number of items:  "+itemNo+" Total price: "+ totalPrice);
	}
	//
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getitemPrice() {
		return itemprice;
	}
	public void setitemPrice(Integer itemprice) {
		this.itemprice = itemprice;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
