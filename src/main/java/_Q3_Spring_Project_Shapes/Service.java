package _Q3_Spring_Project_Shapes;

public class Service {
	
	Shape shape;
	
	public Service() {}
	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public double getArea() {
		return shape.area();
	}
}
