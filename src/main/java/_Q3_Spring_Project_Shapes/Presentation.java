package _Q3_Spring_Project_Shapes;

public class Presentation {
	Service service;
	
	//Non-parameterized constructor
	public Presentation() {
		
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void present() {
		double area = service.getArea();
		
		System.out.println("Area of the shape is: ");
		System.out.println(area);
	}
}
