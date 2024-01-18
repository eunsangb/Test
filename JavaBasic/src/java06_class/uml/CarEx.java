package java06_class.uml;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car("k5", "Black");
	    car.display();
		car.setModel("모닝");
		car.setColor("White");
		
		System.out.println(car.getModel());
		System.out.println(car.getColor());

	}

}
