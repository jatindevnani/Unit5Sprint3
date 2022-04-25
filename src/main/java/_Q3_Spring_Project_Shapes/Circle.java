package _Q3_Spring_Project_Shapes;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (int) (Math.PI * Math.pow(radius, 2));
	}

}
