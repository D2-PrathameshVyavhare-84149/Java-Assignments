package Question2;

import java.util.Arrays;

public class tester {
	public static void main(String[] args) {
		Products[] arr = { new Products(1, "Camera", "D", 5000), new Products(2, "Mobile", "A", 10000),
				new Products(3, "Notebook", "E", 100), new Products(1, "Pizza", "F", 10000),
				new Products(1, "Medicines", "P", 10000), new Products(1, "Bike", "T", 10000),
				new Products(1, "Frying Pan", "K", 10000), new Products(1, "Laptop", "Office", 10000),
				new Products(1, "TV", "Appliance", 10000), new Products(1, "Runner", "Gym", 10000), };

		Arrays.sort(arr);
		for (Products products : arr) {
			System.out.println(products);
		}
	}

}
