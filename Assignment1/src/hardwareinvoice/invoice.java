package hardwareinvoice;
import java.util.Scanner;
public class invoice {
	String partNumber ;
	String partDescription ;
	int quantity ;
	double price ;
	double InvoiceAmount ;
	
	Scanner sc = new Scanner(System.in);
	public invoice(){
		partNumber = "";
		partDescription ="";
		quantity = 0;
		price = 0;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept() {
		System.out.print("Enter part number - ");
		partNumber = sc.next();
		
		System.out.print("Enter part description - ");
		partDescription = sc.next();
		
		System.out.print("Enter quantity - ");
		quantity = sc.nextInt();
		if(quantity<0){
			setQuantity(quantity);	
		}else {
			getPrice();
		};
		
		System.out.print("Enter price - ");
		price = sc.nextInt();
		if(price<0){
			setPrice(0);
		}else {
			getPrice();
		};
		InvoiceAmount = quantity * price ;
	}
	public void display() {
		System.out.println("Part Number - " + partNumber);
		System.out.println("Part Description - " + partDescription);
		System.out.println("Part Quantity - " + quantity);
		System.out.println("Part Price - " + price);
		System.out.println("Invoice Amount - " + InvoiceAmount);
		}
}
