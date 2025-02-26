package Java.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;
	public Product(int id, String name, int price ) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"note",100));
		list.add(new Product(2,"note2",302));
		list.add(new Product(3,"note3",403));
		list.add(new Product(4,"note4",204));
		
		List<String> result = list.stream()
			.filter(p->p.price > 300) // 가격이 300 초과
			.map(p->p.name)
			.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
