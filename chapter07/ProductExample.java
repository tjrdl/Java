package Java.chapter07;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트TV");

		TV tv = product1.getKind();
		String tvmodel = product1.getModel();

		System.out.println(tv);
		System.out.println(tvmodel);

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("disel");

		Car car = product2.getKind();
		String car_model = product2.getModel();

		System.out.println(car);
		System.out.println(car_model);
	}

}
