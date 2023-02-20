package week3.day1;

public class AshokLeyland extends Truck{

	public void color() {
		
		System.out.println("The color of my truck is yellow");
	}
	public static void main(String[] args) {
		 
		AshokLeyland al=new AshokLeyland();
		al.brakes();
		al.color();
		al.noOfWheels();
	}
}
