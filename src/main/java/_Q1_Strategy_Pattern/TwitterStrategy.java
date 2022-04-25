package _Q1_Strategy_Pattern;

public class TwitterStrategy implements Strategy{
	public void connect(String name) {
		System.out.println("Connecting with " + name + " through Twitter");
	}
}
