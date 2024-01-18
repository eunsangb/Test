package java07_inherit.practice.model;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		//중심점
		System.out.print("중심점 : ");
		super.draw(); // system.out.println("(" + x + "," + y + ")");
		
		double area = Math.PI * radius * radius;  //원 면적
		double circumference = 2 * Math.PI * radius;  //원 둘레
		System.out.printf( "면적 : %.1f", area);
		System.out.println();
		System.out.printf("둘레 : %.1f",  circumference);
		System.out.println();
	}
	
}
