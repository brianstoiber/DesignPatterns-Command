package request;

public class Oven {
	
	private int timer = 15; 	// default value in minutes
	private int temperature = 100;  	// default value in Fahrenheit 
	private String latest = ""; 	// stores last action 
	private int previousTimer = 10;	// default time is 10 minutes, used for performing undo if timer changed
	private int previousTemperature = 100;	// default temperature is 100, used for performing undo if temperature is changed
	
	public void on() {
		System.out.println("Oven is on");
	}
	
	public void off() {
		System.out.println("Oven is off");
	}

	// set timer
	public void setTimer(int timer) {
		System.out.println("Previous timer value: " + this.timer + " minutes");
		this.previousTimer = this.timer;
		this.timer = timer;
		latest = "timer";
		System.out.println("Current timer value: " + this.timer + " minutes");
	}

	// set temperature
	public void setTemperature(int temperature) {
		System.out.println("Previous oven temperature: " + this.temperature);
		this.previousTemperature = this.temperature;
		this.temperature = temperature;
		latest = "temperature";
		System.out.println("Current oven temperature: " + this.temperature);
	}
	
	// undo method for the timer and temperature
	public void undo() {
		switch(latest) {
		case "timer":
			System.out.println("Setting timer back to: " + this.previousTimer);
			int temp = this.timer;
			this.timer = this.previousTimer;
			this.previousTimer = temp;
			break;
		case "temperature":
			System.out.println("Setting temperature back to: " + this.previousTemperature);
			temp = this.temperature;
			this.temperature = this.previousTemperature;
			this.previousTemperature = temp;
			break;
		}
	}
	
}