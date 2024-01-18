package java07_inherit.practice2.product;

public class Tv {
	
	private String model;
	private int price;
	
	
	public Tv(String model, int price) {
		
	}
	
	
	public void out() {
		System.out.println("모델명 : " + model + "," + "가격" + price);
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
