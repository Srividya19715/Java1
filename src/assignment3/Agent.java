package assignment3;

public class Agent {
	private String name;
	private long generatedFund;
	
	public Agent(String name, long generatedFund) {
		this.name = name;
		this.generatedFund = generatedFund;
	}
	public Agent() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getGeneratedFund() {
		return generatedFund;
	}
	public void setGeneratedFund(long generatedFund) {
		this.generatedFund = generatedFund;
	}
	

}
