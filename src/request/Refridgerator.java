package request;

public class Refridgerator {
	private int temperature = 0;
	
	public void on() {
		System.out.println("Refridgerator is on");
	}
	
	public void off() {
		System.out.println("Refridgerator is off");
	}

	// sets temperature
	public void setTemperature(int temperature) {
		System.out.println("Previous refridgerator temperature: " + this.temperature);
		this.temperature = temperature;
		System.out.println("Current refridgerator temperature: " + this.temperature);
	}
	
}