package _Q4_Theory_Questions;

public class Main {
	/* 
	 * Q-1 What is IOC Container
	 *		-It is the core of the spring framework.
	 *		-It is used to manage the beans. 
	 *		-It injects the dependencies when the bean is created and 
	 *		-It also manages the life cycle of a bean during execution
	 *		-It provides 2 types of IOC Containers 
	 *			a) Bean Factory
	 *			b) Application Context
	 *
	 * 
	 * Q-2 What are Spring beans?
	 * 		- Beans are just the objects created by the Spring application.
	 * 		- It is basically a managed object i.e its complete control from instantiation 
	 * 		- to destruction lies in the hand of the IOC container (i.e. its life cycle).
	 * 
	 * 		- A spring application is basically a collection of these beans working together.
	 *
	 *
	 * Q-3 What are the bean scopes available in Spring?
	 * 		- The scopes available for a bean in the Spring are -
	 * 			a) Singleton (default)
	 * 			b) Prototype 
	 * 			c) Request
	 * 			d) Session
	 * 
	 * 			(Request and session beans relate to the Spring MVC)
	 * 
	 * 
	 * Q-4 Types of Auto-wiring and its limitations?
	 * 		-Auto-wiring in a Spring Application automatically detects the dependencies based
	 * 		 on certain criteria and injects those dependencies without explicitly providing it
	 * 		 in the ApplicationContext.xml
	 * 
	 * 		-These are the ways to auto-wire in a Spring application
	 * 			a) No auto-wiring (In this case explicit auto-wiring is required)
	 * 			b) By Name (dependencies are injected by name i.e. where the name of the variable
	 * 				and the id in the configuration file is same)
	 * 			c) By Type (Dependency injection on basis of the class type)
	 * 			d) constructor (Dependencies are injected by the requirements of the constructor
	 * 				it uses byName first and then byType)
	 * 
	 * 		-Limitations 
	 * 			Auto-wiring can only inject object dependencies or Reference dependencies but cannot 
	 * 			inject Value type or normal dependencies.
	 * */
}
