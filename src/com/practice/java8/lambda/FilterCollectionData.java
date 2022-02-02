package com.practice.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterCollectionData {

	public static void main(String[] args) {

		List<Products> list = new ArrayList<>();
		list.add(new Products(1, "Samsung A5", 17000));
		list.add(new Products(3, "Iphone 6S", 65000));
		list.add(new Products(2, "Sony Xperia", 25000));
		list.add(new Products(4, "Nokia Lumia", 15000));
		list.add(new Products(5, "Redmi4", 26000));
		list.add(new Products(6, "Lenevo Vibe", 19000));

		// using lambda to filter data
		Stream<Products> filtered_data = list.stream().filter(p -> p.price > 20000);

		// using lambda to iterate through collection
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));
	}

}

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
