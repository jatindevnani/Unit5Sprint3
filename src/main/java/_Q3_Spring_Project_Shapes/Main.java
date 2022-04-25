package _Q3_Spring_Project_Shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Presentation presentationLayer = context.getBean("presentation", Presentation.class);
		
		//Calculating the area of the shape
		//Shape can be provide by changing the dependency from the ApplicationContext.xml
		//Any of the shapes can be passed to the service layer as dependency on initialization
		//Area will be presented by the Presentation layer
		presentationLayer.present();

	}

}
