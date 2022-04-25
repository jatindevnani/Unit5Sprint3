package _Q1_Strategy_Pattern;

public class SocialMediaContext {
	private Strategy strategy;
	
	public SocialMediaContext() {}
	
	public void setSocialmediaStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void connect(String name) {
		strategy.connect(name);
	}
}