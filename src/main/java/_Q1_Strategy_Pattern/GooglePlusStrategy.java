package _Q1_Strategy_Pattern;

public class GooglePlusStrategy implements Strategy{
	public void connect(String name) {
		System.out.println("Connecting with " + name + " through Google Plus");
	}
}
