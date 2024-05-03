package Question2;

public class Products implements Comparable<Products> {
	int id;
	String name;
	String category;
	int price;
	
	public Products() {
		
	}
	
	public Products(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Products [ Id=" + id + ", Name=" + name + ", Category=" + category + ", Price=" + price +"]";
	}
	
	@Override
	public int compareTo(Products o) {
		return this.category.compareTo(o.category);
	}
}
