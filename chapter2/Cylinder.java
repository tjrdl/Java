package chapter2;

public class Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 7;
		double h = 5;
		double x = volume(r,h);
		System.out.println("값은: "+x);
	}
	public static double volume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}

}
