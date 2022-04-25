package _Q1_Strategy_Pattern;

public class FacebookStrategy implements Strategy{

	@Override
	public void connect(String name) {
		System.out.println("Connecting with " + name + " through Facebook");
	}

}
