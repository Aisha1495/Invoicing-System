package InvoicingProgect;

public class Items {

	private String itemName;
	private Integer itemId;
	private Integer itemNo;
	private Integer price;
	private Integer totalPrice=price+itemNo;
	
	
	//
	public void UnitPrice() {
		System.out.println("Item name: "+itemName+ " The price: "+price);
		
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
