package week3.day1;

public class Suzuki extends Bike {

	public void color() {
		
		System.out.println("The colore of my bike is blue");

	}
	public static void main(String[] args) {
		Suzuki sk =new Suzuki();
		sk.color();
		sk.mileage();
		sk.brakes();
	}
}
