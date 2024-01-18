package java07_inherit.practice.model;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		//기준점
		System.out.print("기준점 : ");
		super.draw();
		
		double area1 = width *(double)height;
		double circumference1 = 2 * (width * (double)height);
		System.out.printf("면적 : %.1f", area1);
		System.out.println();
		System.out.printf("둘레 : %.1f", circumference1);
		System.out.println();
	}
	
	
}
