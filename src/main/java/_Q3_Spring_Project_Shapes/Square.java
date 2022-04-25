package _Q3_Spring_Project_Shapes;

public class Square implements Shape{
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
