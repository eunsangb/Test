package java06_class.uml;

public class Car {
	private String model;
		
	private String color;
	
	public Car(String moedel, String color) {
		this.model = model;
		this.color = color;
	}

	public void display() {
		System.out.println("모델 :" + model);
		System.out.println("색상 :" + color);
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

	
	

	
	
	
}
